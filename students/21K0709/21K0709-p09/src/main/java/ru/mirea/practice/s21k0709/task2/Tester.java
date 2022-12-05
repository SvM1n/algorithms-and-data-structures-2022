package ru.mirea.practice.s21k0709.task2;

import java.util.Arrays;

public abstract class Tester {
    public static void main(String[] args) {
        SortingStudents sortingStudents = new SortingStudents(5);
        sortingStudents.setMasStudents(new Student[]{new Student("s", "Gryffindor", 15),
            new Student("Kolya", "Slytherin", 100),
            new Student("Arsen", "Gryffindor", 55),
            new Student("Anna","Ravenclaw", 150),
            new Student("Michail", "Slytherin", 200)});
        System.out.println("(Сортировка по убыванию оценок!)Было: ");
        System.out.println(Arrays.toString(sortingStudents.getMasStudents()));
        sortingStudents.quickSort(0, sortingStudents.getLength() - 1);
        System.out.println("Стало: ");
        System.out.println(Arrays.toString(sortingStudents.getMasStudents()));
    }
}