package ru.mirea.practice;

public class MathFunc implements MathCalculate {

    @Override
    public double pow(double number, int level) {
        return Math.pow(number, level);
    }

    @Override
    public double abs(double real, double im) {
        return Math.sqrt(pow(real, 2) + pow(im, 2));
    }

    public double circleLength(double radius) {
        return 2 * pi * radius;
    }
}