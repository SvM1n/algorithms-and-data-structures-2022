package ru.mirea.practice.task1;

public class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    Circle(double r, String color, boolean filled) {
        this.r = r;
        super.color = color;
        super.filled = filled;
    }

    public String toString() {
        return "Circle with radius " + r;
    }

    @Override
    public double getArea() {
        return 3.14 * this.r * this.r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.r;
    }

    @Override
    public String getType() {
        return "type is circle";
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
}
