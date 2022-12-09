package ru.mirea.practice;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        Moving movingPoint = new MovingPoint(5, 0, 3, 3);
        ((MovingPoint) movingPoint).moveUp();
        ((MovingPoint) movingPoint).moveRight();
        System.out.println(movingPoint);
        MovingCircle movableCircle = new MovingCircle(10, 5, 1, 1, 15);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}
