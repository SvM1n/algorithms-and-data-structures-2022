package ru.mirea.practice.task8;

public class Circle extends Shape {

    protected double radius;

    public Circle(String color, boolean filling, double radius) {
        super(color, filling);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "color = " + color + " filling = " + filling + " radius = " + radius;
    }
}
