package ru.mirea.practice.task1;

/* С помощью наследования создайте дочерние классы Circle,
Rectangle и Square.  Также реализуйте во всех классах методы getArea(), getPerimeter().
Переопределите в дочерних класс методы класса родителя
toString(), getArea(), getPerimeter() и getType(). */

public class Square extends Rectangle {
    protected double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ",  width=" + width + ",  length=" + length + ",  color='" + color + '\'' + ",  filled=" + filled + '}';
    }
}
