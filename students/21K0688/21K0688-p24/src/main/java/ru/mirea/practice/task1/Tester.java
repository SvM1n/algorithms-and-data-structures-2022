package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory complexAbstractFactory = new ConcreteFactory();
        System.out.println(complexAbstractFactory.createComplex());
        System.out.println(complexAbstractFactory.createComplex(12, 3));
    }
}
