package ru.mirea.practice.task2;

import java.util.Random;

public class Circle {
    private Point point;
    private double length;
    private double radius;
    Random rand = new Random();

    public Circle(int x, int y, double radius) {
        this.point = new Point(x, y);
        this.radius = radius;
        length = Math.PI * this.radius * 2;
    }

    public Circle() {
        point = new Point();
        radius = rand.nextDouble();
        length = Math.PI * this.radius * 2;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(int x, int y) {
        this.point.setX(x);
        this.point.setY(y);
    }

    @Override
    public String toString() {
        return " Point " + point + " radius " + radius + " length " + length;
    }
}
