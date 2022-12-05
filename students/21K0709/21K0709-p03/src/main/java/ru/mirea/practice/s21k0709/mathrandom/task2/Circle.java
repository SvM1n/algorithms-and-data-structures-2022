package ru.mirea.practice.s21k0709.mathrandom.task2;

public class Circle {
    private double r;
    private double l; // длина окружности
    private Point p = new Point();

    public Circle() {
        // The explicit constructor is here, so that it is possible to provide Javadoc.
    }

    public Circle(Point p,double r, double l) {
        this.p = p;
        this.r = r;
        this.l = l;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Координаты: " + "p:  " + p + " r = " + r + " l = " + (2 * Math.PI * r);
    }
}
