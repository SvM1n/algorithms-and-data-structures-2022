package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(4.5, 100),
            new Student(3.2, 154),
            new Student(3.8, 121),
            new Student(4.1, 211)};

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