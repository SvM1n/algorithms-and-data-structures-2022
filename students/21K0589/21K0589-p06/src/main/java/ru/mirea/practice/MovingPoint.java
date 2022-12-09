package ru.mirea.practice;

public class MovingPoint implements Moving {
    int x;
    int y;

    int xSpeed;
    int ySpeed;
    protected int x1;
    protected int y1;

    public MovingPoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        this.x1 = x;
        this.y1 = y;
    }

    @Override
    public String toString() {
        return "Точка с координатами: " + x + " " + y + "\nПередвигается в к-ты: " + x1 + " " + y1;
    }

    @Override
    public void moveUp() {
        this.y1 -= ySpeed;
    }

    @Override
    public void moveDown() {
        this.y1 += ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x1 -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x1 += xSpeed;
    }
}
