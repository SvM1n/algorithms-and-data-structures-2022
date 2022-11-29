package ru.mirea.practice.s21k0709.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double mathPow(double number) {
        return number * number;
    }

    @Override
    public double absComplex(double a, double b) {
        return Math.sqrt(mathPow(a) + mathPow(b));
    }

    @Override
    public double lengthCircle(double l, double r) {
        return PI * l * r;
    }

}
