package ru.mirea.practice.s21k0709.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Earth earth = new Earth("Земля", 1674.365, 9.8);
        Elephant elephant = new Elephant("Слон", 1000, "female");
        System.out.println(elephant.getName());
        System.out.println(earth.getName());
    }
}
