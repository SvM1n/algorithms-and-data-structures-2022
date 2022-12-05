package ru.mirea.practice2.task3;

public class Circle {

    Point center;
    private double radius;


    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius="
                + radius + ", center="
                + center + '}';
    }
}
