package ru.mirea.practice.s21k0709.task1to3;

import java.util.Arrays;

public abstract class Tester {
    public static void main(String[] args) {
        SortingStudents sortingStudents = new SortingStudents(5);
        sortingStudents.setMasStudents(new Student[]{new Student("Kirill", "Kirillov", "IT",2,"KVBO-03-21",10),
            new Student("Kolya", "Gorushko", "IT",2,"KVBO-03-21",10),
            new Student("Arsen", "Ivanov", "IT",3,"KVBO-07-20",20),
            new Student("Anna","Ivanova", "IT",1,"KVBO-04-22",35),
            new Student("Michail", "Michailov", "IT",2,"KVBO-05-21",5)});
        System.out.println("(Сортировка по убыванию оценок!)Было: ");
        System.out.println(Arrays.toString(sortingStudents.getiDNumber()));
        sortingStudents.quickSort(0, sortingStudents.getLength() - 1);
        System.out.println("Стало: ");
        System.out.println(Arrays.toString(sortingStudents.getiDNumber()));
        SortingStudents sortingStudents2 = new SortingStudents(3);
        sortingStudents2.setMasStudents(new Student[]{new Student("Kirill", "Kirillov", "IT",2,"KVBO-03-21",15),
            new Student("Kolya", "Gorushko", "IT",3,"KVBO-03-21",40),
            new Student("Michail", "Michailov", "IT",2,"KVBO-05-21",35)});
        System.out.println("Было: ");
        System.out.println(Arrays.toString(sortingStudents2.getiDNumber()));
        System.out.println("Стало: ");
        MergeSort.mergeSort(sortingStudents2.getiDNumber(), sortingStudents2.getLength());
        System.out.println(Arrays.toString(sortingStudents2.getiDNumber()));
    }
}