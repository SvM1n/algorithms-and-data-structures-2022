package ru.mirea.practice;

public class MovingCircle implements Moving {
    int rand;
    MovingPoint center;


    MovingCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center = new MovingPoint(x, y, xspeed, yspeed);
        this.rand = radius;
    }

    @Override
    public String toString() {
        return "Окружность с центром " + center +  "\nРадиусом " + rand;
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
