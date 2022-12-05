package ru.mirea.practice.mathandrandom.task2;

import java.util.Random;

abstract class Tester {
    public static void main(String[] args) {
        int n = 3;
        Circle[] circles = new Circle[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            Point tmp1 = new Point(rand.nextDouble(), rand.nextDouble());
            Circle tmp2 = new Circle(tmp1, rand.nextDouble());
            circles[i] = tmp2;
        }
        Circle.sort(circles);
        for (Circle c: circles) {
            System.out.println(c.toString());
        }
        System.out.println("Max: " + Circle.max(circles).toString());
        System.out.println("Min: " + Circle.min(circles).toString());

    }

}


