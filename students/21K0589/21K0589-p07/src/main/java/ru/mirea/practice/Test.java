package ru.mirea.practice;

public abstract class Test {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        System.out.println(mathFunc.pow(9, 2));
        System.out.println(mathFunc.abs(10, 2));
        System.out.println(mathFunc.circleLength(10));
    }
}
