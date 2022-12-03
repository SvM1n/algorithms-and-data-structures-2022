package ru.mirea.practice.task1;

public class Circle extends Shape {

    private double r;

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }


    public Circle(double r) {
        this.r = r;
    }
}