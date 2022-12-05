package ru.mirea.practice.task3.s21k0709;

public class Circle {
    private double r;
    private String color;
    private Point p = new Point();

    public Circle() {
        // //
    }

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Координаты: " + "p:  " + p + " r = " + r;
    }
}
