package ru.mirea.practice.solutiontask2;

public class Circle {

    private Point center;
    private double radius;


    public Circle(Point centerIn, double radius) {
        this.center = centerIn;
        this.radius = radius;
    }

    public Circle() {
        this.center = new Point();
        this.radius = 0.0;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getR() {
        return this.radius;
    }

    public void setPoint(Point center) {
        this.center = center;
    }

    public void setR(double radius) {
        this.radius = radius;
    }

    public void setPointR(Point center, double r) {
        this.center = center;
        this.radius = r;
    }

    @Override
    public String toString() {
        return "Окружность с центром " + this.center.toString() + " и радиусом " + this.radius;
    }
}