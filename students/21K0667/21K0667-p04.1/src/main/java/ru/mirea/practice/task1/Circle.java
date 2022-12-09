package ru.mirea.practice.task1;


public class Circle extends Shape {

    private double radius;

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return getType() + " Area: " + getArea() + "\t" + getType() + " Perimeter: " + getPerimeter();
    }
}
