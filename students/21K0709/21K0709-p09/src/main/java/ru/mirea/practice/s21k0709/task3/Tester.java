package ru.mirea.practice.s21k0709.task3;

import java.util.Arrays;

public abstract class Tester {

    public static void main(String[] args) {
        Student[] studentsArr = new Student[]{new Student("s", "Gryffindor", 21341),
            new Student("s", "Slytherin", 41321),
            new Student("s", "Gryffindor", 11141),
            new Student("s", "Slytherin", 11376)};
        System.out.println("Было: ");
        System.out.println(Arrays.toString(studentsArr));
        System.out.println("Стало: ");
        MergeSort.mergeSort(studentsArr,studentsArr.length);
        System.out.println(Arrays.toString(studentsArr));
    }
}