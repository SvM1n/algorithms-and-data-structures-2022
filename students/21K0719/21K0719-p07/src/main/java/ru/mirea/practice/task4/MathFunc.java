package ru.mirea.practice.task4;


public class MathFunc implements MathCalculable {

    @Override
    public double pow(double number, int level) {
        return Math.pow(number, level);
    }

    @Override
    public double abs(double real, double im) {
        return Math.sqrt(pow(real, 2) + pow(im, 2));
    }

    public double circumferenceLength(double radius) {
        return 2 * pi * radius;
    }
}
