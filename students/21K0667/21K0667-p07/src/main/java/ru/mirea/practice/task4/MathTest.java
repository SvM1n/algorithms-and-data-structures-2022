package ru.mirea.practice.task4;

public abstract class MathTest {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        System.out.println(mathFunc.pow(5, 2));
        System.out.println(mathFunc.abs(5, 2));
        System.out.println(mathFunc.length(5));
    }
}
