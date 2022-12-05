package ru.mirea.practice2.task2;

public class Ball {
    double x;
    double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moveX(double z) {
        this.x += z;
    }

    public void moveY(double z) {
        this.y += z;
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

    @Override
    public String toString() {
        return "Ball{" + "x="
                + x + ", y="
                + y + '}';
    }
}
