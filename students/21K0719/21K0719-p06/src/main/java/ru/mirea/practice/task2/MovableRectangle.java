package ru.mirea.practice.task2;

class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;


    public void check(int xspeed, int yspeed) {
        if (xspeed == yspeed) {
            System.out.print("Error!\nXspeed != Yspeed");
            System.exit(0);
        }
    }

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(topLeft.x, topLeft.y, xspeed, yspeed);
        this.bottomRight = new MovablePoint(bottomRight.x, bottomRight.y, xspeed, yspeed);
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
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public String toString() {
        return "topLeft " + topLeft + ", bottomRight " + bottomRight;
    }
}