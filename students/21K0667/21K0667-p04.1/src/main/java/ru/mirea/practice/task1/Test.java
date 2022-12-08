package ru.mirea.practice.task1;

public abstract class Test {
    public static void main(String[] args) {
        Shape square = new Square(10);
        System.out.println(square);
        Shape rectangle = new Rectangle(6, 7);
        System.out.println(rectangle);
        Shape circle = new Circle(13);
        System.out.println(circle);
    }
}
