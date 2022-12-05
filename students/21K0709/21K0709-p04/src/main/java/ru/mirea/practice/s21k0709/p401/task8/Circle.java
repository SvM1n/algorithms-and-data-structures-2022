package ru.mirea.practice.s21k0709.p401.task8;

public class Circle extends Shape {
    double r;
    String color;

    Circle() {
        //
    }

    Circle(double r) {
        this.r = r;
    }

    Circle(double r, String color, boolean filled) {
        this.r = r;
        this.color = color;
        this.filled = filled;
    }

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

    @Override
    public String toString() {
        return "Color: " + color + "\n" + "Radius: " + r;
    }
}
