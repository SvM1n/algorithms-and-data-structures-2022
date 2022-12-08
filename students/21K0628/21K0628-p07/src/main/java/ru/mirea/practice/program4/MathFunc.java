package ru.mirea.practice.program4;

public class MathFunc implements MathCalculable {
    private double x;
    private double y;

    public MathFunc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double pow(int degree) {
        return Math.pow(this.abs(), degree) * (Math.cos(degree * Math.atan(y / x) + Math.sin(degree * Math.atan(y / x))));
    }

    @Override
    public double abs() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return x + "+" + y + "i";
    }

}
