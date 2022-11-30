package ru.mirea.practice.task3;

import ru.mirea.practice.task1.Student;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Арсюша Худякоу", "КВБО-03-21", 2, "ИВТ", 2.28),
            new Student("Арсюша Худякоу", "КВБО-03-21", 2, "ИВТ", 1.27),
            new Student("Арсюша Худякоу", "КВБО-03-21", 2, "ИВТ", 3.78),
            new Student("Арсюша Худякоу", "КВБО-03-21", 2, "ИВТ", 4.78)};

        System.out.print("Сортировка по GPA\n");
        print(students);
        MergeSort.mergeSort(students, students.length);
        System.out.println();
        print(students);
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + "\n");
        }
    }
}
