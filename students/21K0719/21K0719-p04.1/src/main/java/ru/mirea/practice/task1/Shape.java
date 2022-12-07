package ru.mirea.practice.task1;

public abstract class Shape {
    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getType() + " area: " + getArea() + "\n" + getType() + " perimeter: " + getPerimeter();
    }
}
