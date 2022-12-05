package ru.mirea.practice.mathandrandom.task2;

public class Circle extends Point {
    private Point center;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
        center = new Point(0, 0);
    }

    public double square() {
        return Math.pow(3.14, 2) * radius;
    }

    public double length() {
        return 2 * 3.14 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double x, double y) {
        center.setX(x);
        center.setY(y);
    }

    public static void sort(Circle[] circles) {
        for (int i = 0; i < circles.length; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                if (circles[i].getRadius() > circles[j].getRadius()) {
                    Circle tmp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = tmp;
                }
            }
        }
    }

    public static Circle min(Circle[] circles) {
        Circle.sort(circles);
        return circles[0];
    }

    public static Circle max(Circle[] circles) {
        Circle.sort(circles);
        return circles[circles.length - 1];
    }

    @Override
    public String toString() {
        return center.toString() + " Radius = " + this.getRadius();
    }
}
