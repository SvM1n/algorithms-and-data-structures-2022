package ru.mire.practice.task2;

public abstract class Test {
    public static void main(String[] args) {

        MathCalculable mathFunc = new MathFunc();

        System.out.println(mathFunc.abs(-3));
        System.out.println(mathFunc.pow(2, 4) );
        System.out.println(mathFunc.circlePerimeter(5));

    }
}
