package ru.mirea.practice.s21k0709.mathrandom.task2;

public class Point {
    private float x = 0;
    private float y = 0;

    public Point() {
        // The explicit constructor is here, so that it is possible to provide Javadoc.
    }

    public Point(float  x, float  y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float  x) {
        this.x = x;
    }

    public float  getX() {
        return x;
    }

    public void setY(float  y) {
        this.y = y;
    }

    public float  getY() {
        return y;
    }



    @Override
    public String toString() {
        return  "x = " + x + " y = " + y;
    }
}
