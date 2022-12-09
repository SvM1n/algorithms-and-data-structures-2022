package ru.mirea.practice.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("x:\t" + ball.getX());
            System.out.println("Введите координату х:\t");
            if (scn.hasNextDouble()) {
                ball.setX(scn.nextDouble());
            }
            System.out.println("y:\t" + ball.getY());
            System.out.println("Введите координату y:\t");
            if (scn.hasNextDouble()) {
                ball.setY(scn.nextDouble());
            }
            System.out.println("Введите координаты x и y:\t");
            if (scn.hasNextDouble()) {
                ball.setX(scn.nextDouble());
                ball.setY(scn.nextDouble());
            }
            System.out.println("Введите пройденный путь мяча (в координатах) :\t");
            if (scn.hasNextDouble()) {
                ball.move(scn.nextDouble(), scn.nextDouble());
            }
            System.out.println("Конечные координаты:\t" + ball.getX() + "\t" + ball.getY());
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
