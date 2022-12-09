package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        int[] arrOfId = new int[] {45, 332, 64, 79, 627, 14, 95, 21, 11, 8, 9};
        Student student = new Student(arrOfId);
        student.print();
        student.sort();
        System.out.println();
        student.print();
    }
}
