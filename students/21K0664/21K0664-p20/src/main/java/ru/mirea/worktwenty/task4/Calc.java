package ru.mirea.worktwenty.task4;

public abstract class Calc {
    public static <T> Integer sum(T a, T b) {
        return (Integer) a + (Integer) b;
    }

    public static <T> Integer multiply(T a, T b) {
        return (Integer) a * (Integer) b;
    }

    public static <T> Integer divide(T a, T b) {
        return (Integer) a / (Integer) b;
    }

    public static <T> Integer subtraction(T a, T b) {
        return (Integer) a - (Integer) b;
    }
}