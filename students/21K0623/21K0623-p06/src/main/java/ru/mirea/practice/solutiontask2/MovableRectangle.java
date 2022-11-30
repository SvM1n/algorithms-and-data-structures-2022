package ru.mirea.practice.solutiontask2;

import ru.mirea.practice.solutiontask1.Movable;
import ru.mirea.practice.solutiontask1.MovablePoint;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "Прямоугольник, левая верхняя точка: " + topLeft
                + "\nПравая нижняя точка:" + bottomRight;
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }
}
