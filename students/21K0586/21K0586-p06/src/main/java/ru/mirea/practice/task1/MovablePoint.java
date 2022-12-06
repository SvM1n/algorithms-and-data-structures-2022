package ru.mirea.practice.task1;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveDown() {
        System.out.println("the point is moving down");
    }

    @Override
    public void moveUp() {
        System.out.println("the point is moving up");
    }

    @Override
    public void moveLeft() {
        System.out.println("the point is moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("the point is moving right");
    }
}
