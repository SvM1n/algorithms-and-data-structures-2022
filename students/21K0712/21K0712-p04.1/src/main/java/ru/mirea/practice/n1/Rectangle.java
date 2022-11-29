package ru.mirea.practice.n1;

public class Rectangle extends Shape {
    double a;
    double b;

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return a + b + a + b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle{"
                +
                "a=" + a
                +
                ", b=" + b
                +
                ", area=" + area
                +
                ", perimeter=" + perimeter
                +
                '}';
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
