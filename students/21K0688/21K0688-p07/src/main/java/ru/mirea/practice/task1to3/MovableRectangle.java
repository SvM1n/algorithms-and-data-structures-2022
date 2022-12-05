package ru.mirea.practice.task1to3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        bottomRight = new MovablePoint(x1, y1, xspeed, yspeed);
        topLeft = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    public boolean speedTest() {
        return bottomRight.xSpeed == topLeft.xSpeed && bottomRight.ySpeed == topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
                + "topLeft=" + topLeft
                + ", bottomRight=" + bottomRight
                + '}';
    }
}
