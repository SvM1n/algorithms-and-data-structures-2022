package practice.task2;

public class Ball {
    protected double x = 0.0;
    protected double y = 0.0;

    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Ball() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y = y;
    }

    public void printCords() {
        System.out.println(this.x + " " + this.y);
    }

    public String toString() {
        String s;
        s = "x=" + String.valueOf(this.x) + " y=";
        s += String.valueOf(this.y);
        return s;
    }
}