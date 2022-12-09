package ru.mirea.practice.task6;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle first = new Circle(10);
        Circle second = new Circle(15);
        Circle third = new Circle(10);
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
    }
}
