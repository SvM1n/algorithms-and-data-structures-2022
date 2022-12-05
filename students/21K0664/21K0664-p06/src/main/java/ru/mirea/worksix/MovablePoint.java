package ru.mirea.worksix;

class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xspeed;
    protected int yspeed;


    MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        y += yspeed;
    }

    @Override
    public void moveDown() {
        y -= yspeed;
    }

    @Override
    public void moveRight() {
        x += xspeed;
    }

    @Override
    public void moveLeft() {
        x -= xspeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ')';
    }
}
