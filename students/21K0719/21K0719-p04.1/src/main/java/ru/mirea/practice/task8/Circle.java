package ru.mirea.practice.task8;

public class Circle extends Shape {

    protected double r;

    public Circle(String color, boolean filling, double r) {
        super(color, filling);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
        r = 0;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "color = " + color + " filling = " + filling + " radius = " + r;
    }
}