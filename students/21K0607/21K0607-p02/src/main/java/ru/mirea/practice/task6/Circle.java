package ru.mirea.practice.task6;


import java.util.Objects;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circleLen(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
