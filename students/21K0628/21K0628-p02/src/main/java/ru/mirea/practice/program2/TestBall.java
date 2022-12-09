package ru.mirea.practice.program2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(9.5, 16.7);
        System.out.println(ball);
        ball.move(5, 5);
        System.out.println(ball);
    }
}