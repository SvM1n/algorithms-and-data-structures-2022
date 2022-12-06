package ru.mirea.practice.task2;

import ru.mirea.practice.task3.LoopList;
import ru.mirea.practice.task1.Student;

public abstract class Main {

    public static void main(String[] args) {
        LoopList<Student> students = new LoopList<>();
        students.add(new Student("Vasya", 13293, 32423));
        students.add(new Student("Petya", 1334293, 3223423));
        students.add(new Student("Ivan", 1322493, 3242423));
        students.print();
        students.removeFirst();
        students.print();
    }

}