package ru.mirea.practice.s21k0627.task1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int r, int x, int y, int xspeed, int yspeed) {
        this.radius = r;
        center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{"
                + "radius = " + radius
                + ", center = " + center + '}';
    }
}
