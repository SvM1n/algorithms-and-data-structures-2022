package ru.mirea.practice.program6;

public class Circle {
    private double r;
    private int x;
    private int y;

    public Circle() {
        r = 0;
        x = 0;
        y = 0;
    }

    public Circle(float r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public static void compare(Circle first, Circle second) {
        if (first.findArea() > second.findArea()) {
            System.out.print("First circle > Second circle");
        }
        if (first.findArea() < second.findArea()) {
            System.out.print("Second circle > First circle");
        }
    }

    public double getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{"
                +
                "r="
                +
                r
                +
                ", x="
                +
                x
                +
                ", y="
                +
                y
                +
                '}';
    }

    public double findArea() {
        return Math.PI * r * r;
    }

    public double length() {
        return 2 * Math.PI * r;
    }
}
