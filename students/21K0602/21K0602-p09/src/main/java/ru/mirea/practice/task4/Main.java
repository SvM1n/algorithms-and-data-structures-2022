package ru.mirea.practice.task4;

import ru.mirea.practice.task1.Student;

public abstract class Main {

    public static void main(String[] args) {
        Sorting comparable = new Sorting(new Student[]{
            new Student("john",123,325), new Student("Rick", 513,214),
            new Student("Morty",12,21421),new Student("Jerry",112,14234235)
        },4);
        System.out.println("Before: ");
        System.out.println(comparable);
        comparable.sort();
        System.out.println("After: ");
        System.out.println(comparable);

    }
}
