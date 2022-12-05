package ru.mirea.practice.task6.s21k0627;

public class Circle {
    private double x = 0.0;
    private double y = 0.0;
    private double r = 0.0;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getSquare() {
        return Math.PI * r * r;
    }

    public String compareCircles(Circle c) {
        if (this.r > c.r) {
            return "1 circle more than 2 circle";
        } else if (this.r < c.r) {
            return "1 circle less than 2 circle";
        } else {
            return "1 circle equals 2 circle";
        }
    }
}
