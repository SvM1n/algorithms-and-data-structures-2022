package ru.mirea.practice.task8;

public class Square extends Rectangle {
    private double side;

    public Square() {
        side = 0;
    }

    public Square(double side, String color, boolean filling) {
        this.side = side;
        this.color = color;
        this.filling = filling;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
    }

    @Override
    public void setLength(double side) {
        length = side;
    }

    @Override
    public String toString() {
        return "color = " + color + " filling = " + filling + " side = " + side;
    }
}