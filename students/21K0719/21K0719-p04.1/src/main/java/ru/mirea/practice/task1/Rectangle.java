package ru.mirea.practice.task1;

public class Rectangle extends Shape {

    private double a;
    private double b;

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
