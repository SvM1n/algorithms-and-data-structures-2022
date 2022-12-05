package ru.mirea.practice.task6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double sqare() {
        return Math.PI * this.radius * this.radius;
    }

    public double length() {
        return Math.PI * 2 * this.radius;

    }

    public boolean checkEquals(Circle circle2) {
        return this.radius == circle2.radius;
    }
}
