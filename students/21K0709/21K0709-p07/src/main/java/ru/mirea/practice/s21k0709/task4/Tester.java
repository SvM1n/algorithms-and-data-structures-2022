package ru.mirea.practice.s21k0709.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.absComplex(3.5,4.5));
        System.out.println(mc.mathPow(2));
        System.out.println(mc.lengthCircle(5,10));
    }
}
