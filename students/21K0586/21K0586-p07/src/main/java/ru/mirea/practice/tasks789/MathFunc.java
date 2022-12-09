package ru.mirea.practice.tasks789;

public class MathFunc implements MathCalculable {
    public double power(double num, double power) {
        return Math.pow(num, power);
    }

    public double module(double i, double num) {
        return Math.sqrt(i * i + num * num);
    }

    public double circleLength(double r) {
        return 2 * Pi * r;
    }
}
