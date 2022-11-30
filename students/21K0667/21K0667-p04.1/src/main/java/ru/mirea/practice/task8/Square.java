package ru.mirea.practice.task8;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        side = 0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Цвет: " + color + ", залито: " + filled + ", сторона: " + side;
    }


}
