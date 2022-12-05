package ru.mirea.practice.task3.s21k0627;

public abstract class Tester {
    public static void main(String[] args) {
        int number = 5;
        Circle[] circles1 = new Circle[number];
        for (int i = 0; i < number; i++) {
            circles1[i] = new Circle();
        }
        for (Circle j : circles1) {
            System.out.println(j.toString());
        }
    }
}
