package ru.mirea.practice.task2.s21k0627;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball() {
        //
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xdisp, double ydisp) {
        this.x = xdisp;
        this.y = ydisp;
    }

    public String toString() {
        return "coordinates: " + "x=" + x + ", y=" + y;
    }
}
