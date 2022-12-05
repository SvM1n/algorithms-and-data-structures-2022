package ru.mirea.practice.n1;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xspeed) {
        this.xSpeed = xspeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int yspeed) {
        this.ySpeed = yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                +
                "x=" + x
                +
                ", y=" + y
                +
                ", xSpeed=" + xSpeed
                +
                ", ySpeed=" + ySpeed
                +
                '}';
    }
}
