package ru.mirea.practice.mathsandrandom.program2;

import java.util.Random;

public class Circle {
    private int r;
    private int x;
    private int y;
    Random rand = new Random();

    public Circle() {
        r = rand.nextInt(20) + 1;
        x = rand.nextInt(15) + 10;
        y = rand.nextInt(25) + 23;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle{"
                +
                "r="
                +
                r
                +
                ", x="
                +
                x
                +
                ", y="
                +
                y
                +
                '}';
    }
}
