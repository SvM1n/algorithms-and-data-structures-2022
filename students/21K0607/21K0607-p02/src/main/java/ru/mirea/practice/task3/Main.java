package ru.mirea.practice.task3;

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random(), Math.random(), Math.random());
        }

        System.out.println(Arrays.toString(circles));
    }
}
