package ru.mirea.practice.solutiontask8;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Квадрат с сторонами: " + width
                + "\nПлощадь: " + getArea() + "\nПериметр: " + getPerimeter()
                + "\nЦвет: " + color + " Закрашенный: " + filled;
    }

}
