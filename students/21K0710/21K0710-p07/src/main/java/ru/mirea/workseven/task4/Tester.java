package ru.mirea.workseven.task4;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        MathFunc func = new MathFunc();
        System.out.println(func.circleLength(2));
        System.out.println(func.mathComplexAbs(3, -2));
        System.out.println(func.mathPow(3, 5));
    }
}
