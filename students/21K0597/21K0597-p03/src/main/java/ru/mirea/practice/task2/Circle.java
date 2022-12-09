package ru.mirea.practice.task2;

public class Circle {
    private Point center;
    private int radius;

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + this.center.toString() + ", radius=" + this.radius + '}';
    }
}
