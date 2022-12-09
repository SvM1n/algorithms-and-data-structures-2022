package ru.mirea.practice.task2;

import java.util.Random;

public class Point {
    private int x;

    private int y;

    Random rand = new Random();

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = rand.nextInt(10);

        y = rand.nextInt(10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return " x " + x + " y " + y;
    }
}
