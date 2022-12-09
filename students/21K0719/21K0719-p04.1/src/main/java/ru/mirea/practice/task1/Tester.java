package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle + "\n");

        Shape rectangle = new Rectangle(3, 6);
        System.out.println(rectangle + "\n");

        Shape square = new Square(25);
        System.out.println(square);
    }
}