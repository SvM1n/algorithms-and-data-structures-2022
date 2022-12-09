package ru.mirea.practice.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(15, 30);
        System.out.println(ball);
        ball.setX(20);
        ball.setY(15);
        System.out.println(ball);
        ball.setXY(10, 10);
        System.out.println(ball);
        ball.move(15, 17);
    }
}
