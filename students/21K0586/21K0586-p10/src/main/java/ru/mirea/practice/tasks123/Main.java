package ru.mirea.practice.tasks123;

public abstract class Main {

    public static Student[] iDNumber;

    public static void setidNumber(Student[] students) {
        System.arraycopy(students, 0, iDNumber, 0, students.length);
    }
}