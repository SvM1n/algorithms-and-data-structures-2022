package ru.mire.practice.task2;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double number, int power) {
        return Math.pow(number, power);
    }
    @Override
    public double abs(double number) {
        return Math.abs(number);
    }
    @Override
    public double circlePerimeter(double radius) {
        return 2 * pi * radius;
    }
}
