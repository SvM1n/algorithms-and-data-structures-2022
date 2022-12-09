package ru.mirea.practice.task3;

public class Circle {
    private class Point {
        public double x;
        public double y;

        public Point() {
            x = 0.0;
            y = 0.0;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    private double radius;

    private Point point;

    public Circle(double x, double y, double radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
        point = new Point();
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return point.x;
    }

    public double getY() {
        return point.x;
    }

    public void setX(double x) {
        point.x = x;
    }

    public void setY(double y) {
        point.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", x =" + point.x + " y = " + point.y + '}';
    }
}
