package ru.mirea.practice.n1;

public class Circle extends Shape {
    private double r;

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    public Circle() {
        this.r = 0.0;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle{"
                +
                "r=" + r
                +
                ", area=" + area
                +
                ", perimeter=" + perimeter
                +
                '}';
    }

    public void setR(double r) {
        this.r = r;
    }
}
