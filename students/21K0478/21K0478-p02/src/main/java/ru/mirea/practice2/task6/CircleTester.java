package ru.mirea.practice2.task6;

abstract class CircleTester {
    public static void main(String[] args) {
        Circle circle2 = new Circle(12, 3, 12);
        circle2.setYcor(23);
        circle2.getYcor();
        circle2.setXcor(12);
        circle2.getXcor();
        circle2.setRadius(12);
        circle2.getRadius();
        Circle circle1 = new Circle(24);
        Circle.compare(circle1, circle2);
    }
}
