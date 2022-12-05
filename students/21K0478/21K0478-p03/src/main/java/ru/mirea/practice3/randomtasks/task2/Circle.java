package ru.mirea.practice3.randomtasks.task2;

public class Circle {

    public final Point center;
    private double radius;


    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double x, double y) {
        this.center = new Point(x, y);
    }

    public double getX() {
        return center.getX();
    }

    public void setX(double x) {
        this.setX(x);
    }

    public double getY() {
        return center.getY();
    }

    public void setY(double y) {
        center.setY(y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius="
                + radius + ", center="
                + center + '}';
    }
}
