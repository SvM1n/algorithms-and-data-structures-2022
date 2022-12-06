package ru.mirea.practice.task1;

public class Rectangle extends Shape {
    private double hight;
    private double width;

    public Rectangle(double hight, double width, String color, boolean isFilled) {
        this.hight = hight;
        this.width = width;
        super.color = color;
        super.filled = isFilled;
    }

    public Rectangle() {

    }

    @Override
    public String getType() {
        return "type is rectangle";
    }

    @Override
    public double getPerimeter() {
        return (this.hight + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.hight * this.width;
    }

    @Override
    public String toString() {
        return "rectangle" + this.hight + "x" + this.width;
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

}
