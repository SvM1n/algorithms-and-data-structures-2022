package ru.mirea.practice.s21k0647.zad1;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;


    MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Окружность с центром " + center +  "\nРадиусом " + radius;
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
}
