package ru.mirea.practice.n1;

public class Square extends Shape {
    int a;

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square{"
                +
                "a=" + a
                +
                ", area=" + area
                +
                ", perimeter=" + perimeter
                +
                '}';
    }

    public void setA(int a) {
        this.a = a;
    }
}
