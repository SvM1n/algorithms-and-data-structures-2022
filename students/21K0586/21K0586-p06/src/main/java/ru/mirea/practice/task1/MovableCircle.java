package ru.mirea.practice.task1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int radius, MovablePoint center) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveDown() {
        System.out.println("the circle is moving down");
    }

    @Override
    public void moveLeft() {
        System.out.println("the circle is moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("the circle is moving right");
    }

    @Override
    public void moveUp() {
        System.out.println("the circle is moving up");
    }
}
