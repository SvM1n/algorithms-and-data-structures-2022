package ru.mirea.worksix;

class MovableCircle implements Movable {
    private MovablePoint a;
    private int radius;


    MovableCircle(MovablePoint a, int radius, int xspeed, int yspeed) {
        this.a = new MovablePoint(a.x, a.y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        a.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
    }

    @Override
    public void moveRight() {
        a.moveRight();
    }

    @Override
    public void moveLeft() {
        a.moveUp();
    }

    @Override
    public String toString() {
        return "Circle with center in " + a + " with radius = " + radius;
    }
}