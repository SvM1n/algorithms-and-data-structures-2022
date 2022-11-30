package ru.mirea.worksix.task2;

import ru.mirea.worksix.task1.Movable;
import ru.mirea.worksix.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

    @Override
    public void moveUp() {
        this.bottomRight.moveUp();
        this.topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        this.bottomRight.moveDown();
        this.topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        this.bottomRight.moveLeft();
        this.topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        this.bottomRight.moveRight();
        this.topLeft.moveRight();
    }
}
