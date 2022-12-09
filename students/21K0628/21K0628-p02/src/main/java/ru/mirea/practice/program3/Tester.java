package ru.mirea.practice.program3;

public abstract class Tester {
    public static void main(String[] args) {
        Point point = new Point(9.6, 7.1);
        Circle circle = new Circle(8.4, point);
        System.out.println(circle);
    }
}