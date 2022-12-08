package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        System.out.println(mathFunc.pow(10, 10));
        System.out.println(mathFunc.abs(10, 5));
        System.out.println(mathFunc.circumferenceLength(5));
    }
}
