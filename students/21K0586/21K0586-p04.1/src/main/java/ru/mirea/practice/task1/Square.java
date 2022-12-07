package ru.mirea.practice.task1;

public class Square extends Rectangle {
    private double width;

    public Square(double width, String color, boolean filled) {
        this.width = width;
        super.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "square" + this.width + "x" + this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    @Override
    public String getType() {
        return "type is square";
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}

