package ru.mirea.practice.n6;

public class Circle {
    private double centerx;
    private double centery;
    private double radius;

    public Circle(double centerx, double centery, double radius) {
        this.centerx = centerx;
        this.centery = centery;
        this.radius = radius;
    }

    public Circle() {
        centerx = 0.0;
        centery = 0.0;
        radius = 0.0;
    }

    public double square() {
        return 3.14 * radius * radius;
    }

    public double length() {
        return 2 * 3.14 * radius;
    }

    public boolean compare(Circle c) {
        boolean b;
        if (radius >= c.radius) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    @Override
    public String toString() {
        return "Circle{"
                +
                "centerx=" + centerx
                +
                ", centery=" + centery
                +
                ", radius=" + radius
                +
                '}';
    }

    public double getcenterx() {
        return centerx;
    }

    public void setcenterx(double centerx) {
        this.centerx = centerx;
    }

    public double getcentery() {
        return centery;
    }

    public void setcentery(double centery) {
        this.centery = centery;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
