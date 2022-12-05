package ru.mirea.practice.s21k0647.zad1;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3, 4, 1, 3);
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(5, 4, 1, 8, 15);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}
