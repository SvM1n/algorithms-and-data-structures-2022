package ru.mirea.practice2.task3;

abstract class Tester {
    public static void main(String[] args) {
        double radius = 4;
        Point center = new Point(12, 13);
        Circle circle = new Circle(radius, center);
        circle.setRadius(5);
        System.out.print(circle);


    }
}
