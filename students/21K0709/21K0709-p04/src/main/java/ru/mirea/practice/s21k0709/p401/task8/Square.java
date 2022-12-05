package ru.mirea.practice.s21k0709.p401.task8;

public class Square extends Rectangle {
    double side;

    Square() {
        //
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Side square: " + side;
    }
}
