package ru.mirea.practice.s21k0709.p401.task1;

public class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
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
