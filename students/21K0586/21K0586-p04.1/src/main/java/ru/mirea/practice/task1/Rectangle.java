package ru.mirea.practice.task1;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width, String color, boolean isFilled) {
        this.height = height;
        this.width = width;
        super.color = color;
        super.filled = isFilled;
    }

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    @Override
    public String getType() {
        return "type is rectangle";
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "rectangle" + this.height + "x" + this.width;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    public double getHight() {
        return height;
    }

    public void setHight(double hight) {
        this.height = hight;
    }

}
