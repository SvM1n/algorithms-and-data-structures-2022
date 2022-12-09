package ru.mirea.practice.s21k0647.punkt4;

import ru.mirea.practice.s21k0647.punkt1.Student;

public class Tester implements Comparable {
    public static void main(String []args) {
        Student[]students1 = new Student[5];
        students1[0] = new Student(5234, "Ivanov Ivan", 97);
        students1[1] = new Student(7152, "Smirnov Ivan", 13);
        students1[2] = new Student(6412, "Petrov Ivan", 32);
        students1[3] = new Student(3125, "Markov Ivan", 55);
        students1[4] = new Student(9432, "Antonow Ivan", 19);
        Student[] students2 = new Student[5];
        Tester t = new Tester();
        t.sorted(students1, students2);
        for (Student x: students2) {
            System.out.println(x);
        }
    }


    @Override
    public void sorted(Student[] students1, Student[] students2) {
        int[] count = new int[100];
        for (Student x: students1) {
            count[x.getGba()]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = students1.length - 1; i >= 0; i--) {
            students2[count[students1[i].getGba()] - 1] = students1[i];
            count[students1[i].getGba()]--;
        }
    }
}
