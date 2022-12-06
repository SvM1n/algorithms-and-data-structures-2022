package ru.mirea.practice.task1;

public class Square extends Shape {
    private double side;

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return getType() + " Area: " + getArea() + "\t" + getType() + " Perimeter: " + getPerimeter();
    }
}
