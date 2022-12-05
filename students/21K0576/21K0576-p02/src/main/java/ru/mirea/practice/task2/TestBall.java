package ru.mirea.practice.task2;

abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(15, 25);
        System.out.println(ball);
        ball.setXY(10, 5);
        System.out.println(ball);
        ball.move(3, 3);
        System.out.println(ball);
        System.out.println(ball.getX() + " " + ball.getY());
    }
}