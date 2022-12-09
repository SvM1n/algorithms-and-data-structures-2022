package ru.mirea.practice.task8;

public class Rectangle extends Shape {
    protected double weight;
    protected double length;

    public Rectangle() {
        weight = 0;
        length = 0;
    }

    public Rectangle(String color, boolean filling, double weight, double length) {
        super(color, filling);
        this.weight = weight;
        this.length = length;
    }

    public Rectangle(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return weight * length;
    }

    @Override
    public double getPerimeter() {
        return (weight + length) * 2;
    }

    @Override
    public String toString() {
        return "color = " + color + " filling = " + filling + " weight = " + weight + " length = " + length;
    }
}
