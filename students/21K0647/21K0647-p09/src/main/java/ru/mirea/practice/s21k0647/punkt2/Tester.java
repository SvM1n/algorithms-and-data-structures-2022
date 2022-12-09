package ru.mirea.practice.s21k0647.punkt2;


import ru.mirea.practice.s21k0647.punkt1.Student;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Student []students = new Student[5];
        students[0] = new Student(5234, "Ivanov Ivan", 97);
        students[1] = new Student(7152, "Smirnov Ivan", 13);
        students[2] = new Student(6412, "Petrov Ivan", 32);
        students[3] = new Student(3125, "Markov Ivan", 55);
        students[4] = new Student(9432, "Antonow Ivan", 19);
    }
}
