package ru.mirea.practice.s21k0647.punkt23;


public class MovableRectangle implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }



    @Override
    public String toString() {
        return "Прямоугольник с верхней правой вершиной: " + topLeft + " и нижней левой вершиной: " + bottomRight;
    }


    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
