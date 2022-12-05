package ru.mirea.practice.task3;

public class Circle {
    private double radius;
    private Point centre;

    public Circle(double radius, Point centre) {
        this.radius = radius;
        this.centre = centre;
    }

    public Circle() {
        this.radius = 1.0;
        this.centre = new Point();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", centre=" + centre.toString() + '}';
    }
}
