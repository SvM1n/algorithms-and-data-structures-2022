package ru.mirea.practice.task124;

import java.util.Comparator;

public class Student implements Comparator {
    private int score;
    private String name;

    Student(int score, String name) {
        this.name = name;
        this.score = score;
    }

    Student() {
        this.name = "no name";
        this.score = 0;
    }

    @Override
    public String toString() {
        return this.name + "has score of " + this.score;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public boolean isLess(Student student) {
        return this.score < student.score;
    }

    public boolean isLess2(Student student) {
        return this.score <= student.score;
    }
}
