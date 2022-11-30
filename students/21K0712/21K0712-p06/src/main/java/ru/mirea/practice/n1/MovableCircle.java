package ru.mirea.practice.n1;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius, MovablePoint center) {
        super(x, y, xspeed, yspeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{"
                +
                "radius=" + radius
                +
                ", center=" + center
                +
                ", x=" + x
                +
                ", y=" + y
                +
                ", xSpeed=" + xSpeed
                +
                ", ySpeed=" + ySpeed
                +
                '}';
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}
