package ru.mirea.practice.task3;

import ru.mirea.practice.task1.Student;

import java.util.Arrays;

public abstract class Main {

    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("s", 1234, 21341),
            new Student("s", 3214, 41321),
            new Student("s", 9639, 11141),
            new Student("s", 6280, 11376)};
        System.out.println("Before: ");
        System.out.println(Arrays.toString(students));
        System.out.println("After: ");
        MergeSorting.mergeSort(students,students.length);
        System.out.println(Arrays.toString(students));
    }
}
