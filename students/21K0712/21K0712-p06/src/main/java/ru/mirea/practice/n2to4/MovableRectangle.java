package ru.mirea.practice.n2to4;

import ru.mirea.practice.n1.MovablePoint;

public class MovableRectangle extends MovablePoint {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int xspeed, int yspeed, MovablePoint topLeft, MovablePoint bottomRight) {
        super(x, y, xspeed, yspeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void equalspeed() {
        this.topLeft.setxSpeed(this.bottomRight.getxSpeed());
        this.topLeft.setySpeed(this.bottomRight.getySpeed());
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
                +
                "topLeft=" + topLeft
                +
                ", bottomRight=" + bottomRight
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
}
