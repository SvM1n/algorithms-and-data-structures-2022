package ru.mire.practice.task2;

/* Разработайте интерфейс MathCalculable, который содержит
объявления математических функций: возведения в степень и модуль
комплексного числа, также содержит число PI. Напишите класс MathFunc,
который реализует, реализует этот интерфейс. Например, вычисления длины
окружности, для чего используйте число PI из интерфейса. Протестируйте класс */

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
