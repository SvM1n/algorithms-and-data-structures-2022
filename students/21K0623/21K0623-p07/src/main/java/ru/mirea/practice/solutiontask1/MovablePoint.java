package ru.mirea.practice.solutiontask1;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Точка на координатак (" + x + ", " + y + ")";
    }

    @Override
    public void moveUp(int yspeed) {
        this.y += yspeed;
    }

    @Override
    public void moveDown(int yspeed) {
        this.y -= yspeed;
    }

    @Override
    public void moveLeft(int xspeed) {
        this.x -= xspeed;
    }

    @Override
    public void moveRight(int xspeed) {
        this.x += xspeed;
    }
}
