package ru.mirea.practice.s21k0647.zad1;

public class MovablePoint implements Movable {
    int x;
    int y;

    int xSpeed;
    int ySpeed;
    protected int x1;
    protected int y1;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        this.x1 = x;
        this.y1 = y;
    }

    @Override
    public String toString() {
        return "Точка " + x + " " + y + "\nПередвигаетсся в " + x1 + " " + y1;
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
