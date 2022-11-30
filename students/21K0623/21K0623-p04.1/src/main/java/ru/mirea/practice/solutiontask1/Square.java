package ru.mirea.practice.solutiontask1;

public class Square extends Shape {
    private final double sidef;

    public Square(double sidef) {
        this.sidef = sidef;
    }

    @Override
    public double getArea() {
        return sidef * sidef;
    }

    public double getPerimeter() {
        return 4 * sidef;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square with sides: " + sidef;
    }
}
