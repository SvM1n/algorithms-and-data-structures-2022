package ru.mire.practice.task1;

/* Напишите по диаграмме класс MovableRectangle (движущийся
прямоугольник), реализующий интерфейс Movable, класс прямоугольник,
который можно представить как две движущиеся точки MovablePoint (верхняя
левая и нижняя правая точки – topLeft и bottomRight), также реализующие
интерфейс Movable; */

public class MovableRectangle implements Movable {
    private final MovablePoint bottomRight;
    private final MovablePoint topLeft;

    public MovableRectangle(int x1, int x2, int y1, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        bottomRight = new MovablePoint(x1, y1, x1Speed, y1Speed);
        topLeft = new MovablePoint(x2, y2, x2Speed, y2Speed);
        speedTest();
    }

    private void speedTest() {
        if (bottomRight.xspeed != topLeft.xspeed) {
            bottomRight.xspeed = topLeft.xspeed;
        }
        if (bottomRight.yspeed != topLeft.yspeed) {
            bottomRight.yspeed = topLeft.yspeed;
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

    @Override
    public String toString() {
        return "MovableRectangle{" + "bottomRight=" + bottomRight + ", topLeft=" + topLeft + '}';
    }
}
