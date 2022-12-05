package ru.mirea.practice.task6;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(2.4, 3.2), 1.5);
        System.out.println(circle.getPoint());
        System.out.println(circle.getRadius());
        System.out.println(circle.getL());
        System.out.println(circle.getS());
        System.out.println(circle.compare(2.4));
    }
}
