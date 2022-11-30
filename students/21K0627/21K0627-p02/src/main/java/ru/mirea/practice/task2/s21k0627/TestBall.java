package ru.mirea.practice.task2.s21k0627;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(5, 2);

        System.out.println("ball 1: " + b1.toString());
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("new coordinates of ball 1: ");
            b1.setX(sc.nextDouble());
            b1.setY(sc.nextDouble());
            System.out.println("new coordinates of ball 2: ");
            b2.setXY(sc.nextDouble(), sc.nextDouble());
        }
        System.out.println("ball 1: " + b1.toString());
        System.out.println("ball 2: " + b2.toString());
        b2.move(3, 2);
        System.out.println("ball 2: " + "x=" + b2.getX() + ", y=" + b2.getY());
    }
}
