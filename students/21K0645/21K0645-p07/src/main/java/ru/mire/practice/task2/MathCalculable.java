package ru.mire.practice.task2;

/* Разработайте интерфейс MathCalculable, который содержит
объявления математических функций: возведения в степень и модуль
комплексного числа, также содержит число PI. Напишите класс MathFunc,
который реализует, реализует этот интерфейс. Например, вычисления длины
окружности, для чего используйте число PI из интерфейса. Протестируйте класс */

public interface MathCalculable {

    double pi = Math.PI;

    double pow(double number, int level);

    double abs(double number);

    double circlePerimeter(double radius);

}
