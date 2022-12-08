package ru.mirea.practice.task8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(String color, boolean filling, double width, double length) {
        super(color, filling);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "color = " + color + " filling = " + filling + " weight = " + width + " length = " + length;
    }
}