package ru.mirea.practice.solutiontask1;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MovablePoint(x1, y1);
        this.bottomRight = new MovablePoint(x2, y2);
    }


    @Override
    public String toString() {
        return "Прямоугольник, левая верхняя точка: " + topLeft
                + "\nПравая нижняя точка:" + bottomRight;
    }

    @Override
    public void moveUp(int yspeed) {
        this.topLeft.moveUp(yspeed);
        this.bottomRight.moveUp(yspeed);
    }

    @Override
    public void moveDown(int yspeed) {
        this.topLeft.moveDown(yspeed);
        this.bottomRight.moveDown(yspeed);
    }

    @Override
    public void moveLeft(int xspeed) {
        this.topLeft.moveLeft(xspeed);
        this.bottomRight.moveLeft(xspeed);
    }

    @Override
    public void moveRight(int xspeed) {
        this.topLeft.moveRight(xspeed);
        this.bottomRight.moveRight(xspeed);
    }
}
