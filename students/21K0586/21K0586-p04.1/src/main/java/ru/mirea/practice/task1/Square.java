package ru.mirea.practice.task1;

public class Square extends Rectangle {
    private double width;

    public Square(double width, String color, boolean filled) {
        this.width = width;
        super.color = color;
        super.filled = isFilled();
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

}

