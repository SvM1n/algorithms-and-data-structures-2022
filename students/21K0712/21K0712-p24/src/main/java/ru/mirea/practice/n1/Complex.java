package ru.mirea.practice.n1;

public class Complex {
    private double x;
    private double y;

    Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        if (y > 0) {
            return x + " + " + y + "i";
        } else if (y == 0) {
            return x + "";
        } else if (y < 0) {
            return x + y + "i";
        } else if (x == 0) {
            return y + "i";
        } else {
            return 0 + "";
        }
    }
}
