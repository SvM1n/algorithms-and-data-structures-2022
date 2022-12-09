package ru.mirea.practice.task2;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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

    public void move(double xdisp, double ydisp) {
        while (xdisp > x || ydisp > y) {
            if (xdisp > x) {
                x++;
            }
            if (ydisp > y) {
                y++;
            }
            System.out.println("x: " + x + " y: " + y);
        }
        System.out.println("final position: " + x + " " + y);
    }

    @Override
    public String toString() {
        return "Balls coordinates: " + x + " " + y;
    }

}
