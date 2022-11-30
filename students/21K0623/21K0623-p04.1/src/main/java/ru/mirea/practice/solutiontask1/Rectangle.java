package ru.mirea.practice.solutiontask1;

public class Rectangle extends Shape {
    private final double sidef;
    private final double sides;
    private final double sidet;

    public Rectangle(double sidef, double sides, double sidet) {
        this.sidef = sidef;
        this.sides = sides;
        this.sidet = sidet;
    }

    @Override
    public double getArea() {
        double temp = getPerimeter() / 2;
        return Math.sqrt(temp * (temp - sidef) * (temp - sides) * (temp - sidet));
    }

    public double getPerimeter() {
        return sidef + sides + sidet;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle with sides: " + sidef + ", " + sides + ", " + sidet;
    }
}
