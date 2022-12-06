package ru.mirea.practice.task8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        filled = false;
        color = "";
        width = 0;
        length = 0;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    public String toString() {
        return "Цвет: " + color + ", залито: " + filled + ", длина: " + length + ", ширина: " + width;
    }
}
