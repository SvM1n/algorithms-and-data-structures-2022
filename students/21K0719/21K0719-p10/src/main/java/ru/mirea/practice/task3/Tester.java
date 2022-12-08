package ru.mirea.practice.task3;

import ru.mirea.practice.task1.Student;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("богданчик", "КВБО-05-21", 5, "ИЧТ", 2.28),
            new Student("Краули демон", "КРБО-03-21", 2, "БЦХ", 1.27),
            new Student("Игорь страпник", "КНБО-03-21", 1, "ИВТ", 3.78),
            new Student("Кибль Рустер", "КВБО-06-20", 2, "ИВТ", 4.78)};

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
