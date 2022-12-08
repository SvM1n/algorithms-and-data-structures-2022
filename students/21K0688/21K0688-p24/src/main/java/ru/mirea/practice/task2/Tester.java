package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        System.out.println("5 + 7 = " + chairFactory.createFunctionalChair().sum(5, 7));
        chairFactory.createMagicChair().doMagic();
        System.out.println("Age of victorian chair: " + chairFactory.createVictorianChair(102).getAge());
    }
}
