package ru.mirea.practice.program2;

import java.util.Scanner;

abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 10);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(ball);
            System.out.println("Enter new co-ords:");
            ball.setXY(sc.nextInt(), sc.nextInt());
            System.out.println(ball);
            System.out.println("Enter move co-ords");
            ball.move(sc.nextInt(), sc.nextInt());
            System.out.println(ball);
        }
    }
}
