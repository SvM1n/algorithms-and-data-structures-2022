package ru.mirea.practice.program8;

public class Square extends Rectangle {

    public Square() {
        this.width = 0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return this.width;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "width=" + width
                + ", color=" + color
                + ", filled=" + filled
                + ", S=" + getArea()
                + ", P=" + getPerimeter() + '}';
    }
}
