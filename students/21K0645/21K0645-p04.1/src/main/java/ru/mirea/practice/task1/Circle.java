package ru.mirea.practice.task1;

/* С помощью наследования создайте дочерние классы Circle,
Rectangle и Square.  Также реализуйте во всех классах методы getArea(), getPerimeter().
Переопределите в дочерних класс методы класса родителя
toString(), getArea(), getPerimeter() и getType(). */

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = Math.abs(radius);
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ",  color='" + color + '\''
                + ",  filled=" + filled
                + '}';
    }
}
