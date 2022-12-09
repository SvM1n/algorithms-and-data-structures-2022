package ru.mirea.practice.task4;

import ru.mirea.practice.task3.Student;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = {new Student(4.5, 123),
            new Student(4.1, 345),
            new Student(3.5, 453),
            new Student(3.9, 234),
            new Student(4.2, 120)};
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
