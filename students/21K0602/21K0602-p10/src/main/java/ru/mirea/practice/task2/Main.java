package ru.mirea.practice.task2;


import ru.mirea.practice.task1.Student;

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa(4);
        sortingStudentsByGpa.setStudents(new Student[]{new Student("s", 1234, 21341),
            new Student("s", 3214, 41321),
            new Student("s", 9639, 11141),
            new Student("s", 6280, 11376)});
        System.out.println("Before: ");
        System.out.println(Arrays.toString(sortingStudentsByGpa.getStudents()));
        sortingStudentsByGpa.quickSort(0, sortingStudentsByGpa.getLength() - 1);
        System.out.println("After: ");
        System.out.println(Arrays.toString(sortingStudentsByGpa.getStudents()));
    }
}
