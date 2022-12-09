package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Movable;
import ru.mirea.practice.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topleft;
    private MovablePoint bottomright;

    MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.bottomright = new MovablePoint(x2, y2, xspeed, yspeed);
        this.topleft = new MovablePoint(x1, y1, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topleft + ", bottomRight=" + bottomright + '}';
    }

    @Override
    public void moveDown() {
        System.out.println("the rectangle is moving down");
    }

    @Override
    public void moveLeft() {
        System.out.println("the rectangle is moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("the rectangle is moving right");
    }

    @Override
    public void moveUp() {
        System.out.println("the rectangle is moving up");
    }
}