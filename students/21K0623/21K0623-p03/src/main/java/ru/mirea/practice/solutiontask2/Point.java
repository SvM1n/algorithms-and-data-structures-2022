package ru.mirea.practice.solutiontask2;

public class Point {
    private double x;
    private double y;

    public Point(double xinp, double yinp) {
        this.x = xinp;
        this.y = yinp;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double xnew) {
        this.x = xnew;
    }

    public void setY(double ynew) {
        this.y = ynew;
    }

    public void setXY(double xnew, double ynew) {
        this.x = xnew;
        this.y = ynew;
    }

    @Override
    public String toString() {
        return "Point (" + this.x + ", " + this.y + ")";
    }


}
