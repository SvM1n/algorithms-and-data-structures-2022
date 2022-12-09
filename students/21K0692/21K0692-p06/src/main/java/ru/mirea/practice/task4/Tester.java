package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Apple apple = new Apple(30);
        Phone phone = new Phone(20000);
        System.out.print(apple.getPrice());
        System.out.println("\n" + phone.getPrice());
    }
}
