package ru.mirea.practice.s21k0709.p401.task1;

public class Circle extends Shape {
    double r;
    String color;

    Circle(double r, String color) {
        this.r = r;
        this.color = color;
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
