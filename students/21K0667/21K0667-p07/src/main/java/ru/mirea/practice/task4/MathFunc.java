package ru.mirea.practice.task4;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double dig, int degree) {
        return Math.pow(dig, degree);
    }

    @Override
    public double abs(double im, double real) {
        return Math.sqrt(pow(real, 2) + pow(im, 2));
    }

    public double length(double rad) {
        return 2 * pi * rad;
    }
}
