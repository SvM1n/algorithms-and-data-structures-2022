package ru.mire.practice.task2;

/* Разработайте интерфейс MathCalculable, который содержит
объявления математических функций: возведения в степень и модуль
комплексного числа, также содержит число PI. Напишите класс MathFunc,
который реализует, реализует этот интерфейс. Например, вычисления длины
окружности, для чего используйте число PI из интерфейса. Протестируйте класс */

public abstract class Test {
    public static void main(String[] args) {

        MathCalculable mathFunc = new MathFunc();

        System.out.println(mathFunc.abs(-3));
        System.out.println(mathFunc.pow(2, 4));
        System.out.println(mathFunc.circlePerimeter(5));

    }
}
