package ru.mirea.practice.task8;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        filled = false;
        color = "";
        radius = 0;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Цвет: " + color + ", залито: " + filled + ", радиус: " + radius;
    }
}
