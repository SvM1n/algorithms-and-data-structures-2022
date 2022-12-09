package ru.mirea.practice.task1to3;


public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        bottomRight = new MovablePoint(x1, y1, x1Speed, y1Speed);
        topLeft = new MovablePoint(x2, y2, x2Speed, y2Speed);
        speedCheck();
    }

    private void speedCheck() {
        if (bottomRight.xSpeed != topLeft.xSpeed) {
            bottomRight.xSpeed = topLeft.xSpeed;
        }
        if (bottomRight.ySpeed != topLeft.ySpeed) {
            bottomRight.ySpeed = topLeft.ySpeed;
        }
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
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();

    }

}
