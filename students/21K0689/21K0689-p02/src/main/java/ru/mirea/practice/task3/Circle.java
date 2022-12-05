package ru.mirea.practice.task3;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        center = new Point();
        radius = 0;
    }

    public Circle(double x, double y, double radius) {
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        center.setX(x);
    }

    public void setY(double y) {
        center.setY(y);
    }

    @Override
    public String toString() {
        return "Circle { center  = " + center.toString() + " with radius " + radius + " }";
    }
}
