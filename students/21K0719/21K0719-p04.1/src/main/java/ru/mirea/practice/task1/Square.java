package ru.mirea.practice.task1;

public class Square extends Shape {
    private double a;

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    public Square(double a) {
        this.a = a;
    }
}
