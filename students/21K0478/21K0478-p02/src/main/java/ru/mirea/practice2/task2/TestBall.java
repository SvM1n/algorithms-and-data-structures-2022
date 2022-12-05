package ru.mirea.practice2.task2;

abstract class TestBall {
    public static void main(String[] args) {
        Ball k1 = new Ball(13.5, 5.6);
        k1.moveX(23);
        System.out.print(k1);
    }
}
