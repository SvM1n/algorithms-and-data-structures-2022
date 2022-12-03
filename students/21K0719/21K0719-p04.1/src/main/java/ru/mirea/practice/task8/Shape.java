package ru.mirea.practice.task8;

public abstract class Shape {
    protected String color;
    protected boolean filling;

    public Shape() {
        color = "black";
        filling = false;
    }

    public Shape(String color, boolean filling) {
        this.color = color;
        this.filling = filling;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color = " + color + " filling = " + filling;
    }
}
