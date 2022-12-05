package ru.mirea.practice.n3;

public class Circle {
    private Point p = new Point();
    private double radius = 0.0;

    public Circle(Point p, double radius) {
        this.p = p;
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                +
                "p=" + p.toString()
                +
                ", radius=" + radius
                +
                '}';
    }
}
