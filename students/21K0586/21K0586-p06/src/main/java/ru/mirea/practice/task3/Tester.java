package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 6371.0);
        System.out.println(earth.getName());
    }
}
