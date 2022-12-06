package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Bread bread = new Bread("Borodinsky", 48);
        System.out.println(bread.getPrice());
    }
}
