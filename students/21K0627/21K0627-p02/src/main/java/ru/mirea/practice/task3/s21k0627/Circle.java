package ru.mirea.practice.task3.s21k0627;

import java.util.Random;

public class Circle {
    private Point centre;
    private int r;

    public Circle() {
        Random rnd = new Random();
        this.centre = new Point(rnd.nextInt(5), rnd.nextInt(5));
        this.r = rnd.nextInt(9) + 1;
    }

    public Circle(Point centre, int r) {
        this.centre = centre;
        this.r = r;
    }

    public String toString() {
        return "centre in point: (" + centre.getX() + "," + centre.getY() + "), r = " + r;
    }
}
