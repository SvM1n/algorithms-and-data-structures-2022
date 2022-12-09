package ru.mire.practice.task1;

/* Напишите по диаграмме класс MovableRectangle (движущийся
прямоугольник), реализующий интерфейс Movable, класс прямоугольник,
который можно представить как две движущиеся точки MovablePoint (верхняя
левая и нижняя правая точки – topLeft и bottomRight), также реализующие
интерфейс Movable; */

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xspeed;
    protected int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        this.y += yspeed;
    }

    @Override
    public void moveDown() {
        this.y -= yspeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xspeed;
    }

    @Override
    public void moveRight() {
        this.x += xspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ",  y=" + y + ",  xspeed=" + xspeed + ",  yspeed=" + yspeed + '}';
    }
}
