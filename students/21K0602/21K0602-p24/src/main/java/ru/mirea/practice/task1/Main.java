package ru.mirea.practice.task1;

public abstract class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        System.out.printf(complex.toString());
    }
}
