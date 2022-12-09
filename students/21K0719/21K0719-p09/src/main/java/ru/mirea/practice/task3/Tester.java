package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(3.5, 200),
            new Student(4.2, 15),
            new Student(1.8, 131),
            new Student(6.1, 21)};

        System.out.print("Сортировка по GPA\n");
        print(students);
        MergeSort.mergeSort(students, students.length);
        System.out.println();
        print(students);
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + " ");
        }
    }
}