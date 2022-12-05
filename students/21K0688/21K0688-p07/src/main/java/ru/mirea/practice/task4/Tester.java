package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        System.out.println(mathFunc.pow(3, 3));
        System.out.println(mathFunc.abs(5, 2));
        System.out.println(mathFunc.circumferenceLength(10));
    }
}
