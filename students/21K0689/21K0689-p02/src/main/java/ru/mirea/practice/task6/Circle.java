package ru.mirea.practice.task6;


public class Circle {
    private double radius;
    private Point point;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /*
    public void setRadius(double radius) {
        this.radius = radius;
    }
    */

    public String getPoint() {
        return point.getPoint();
    }

    /*    public void setPoint(Point point) {
        this.point = point;
    }
    */

    public double getS() {
        return radius * Math.PI;
    }

    public double getL() {
        return 2 * Math.PI * radius;
    }

    public String compare(double radius) {
        if (this.radius > radius) {
            return "first circle bigger";
        }
        return "second circle is bigger";
    }
}

