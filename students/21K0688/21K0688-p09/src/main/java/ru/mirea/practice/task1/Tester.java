package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        int[] arrOfId = new int[] {95, 32, 64, 89, 67, 34, 65, 21, 12, 78, 9};
        Student student = new Student(arrOfId);
        student.print();
        student.sort();
        System.out.println();
        student.print();
    }
}
