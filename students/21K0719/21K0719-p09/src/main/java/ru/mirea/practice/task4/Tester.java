package ru.mirea.practice.task4;

import ru.mirea.practice.task3.Student;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(3.5, 200),
                                           new Student(4.2, 15),
                                           new Student(1.8, 131),
                                           new Student(6.1, 21)};
        Sort sort = new Sort(students);
        print(sort);
        sort.sort();
        System.out.println();
        print(sort);
    }

    public static void print(Sort arr) {
        for (int i = 0; i < arr.getArr().length; i++) {
            System.out.print(arr.getArr()[i] + " ");
        }
    }
}
