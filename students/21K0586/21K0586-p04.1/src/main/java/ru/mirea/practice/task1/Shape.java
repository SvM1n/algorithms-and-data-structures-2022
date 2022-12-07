package ru.mirea.practice.task1;

public abstract class Shape {
    protected String color;
    protected boolean filled;


    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getType() {
        return "type is shape";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();
}

