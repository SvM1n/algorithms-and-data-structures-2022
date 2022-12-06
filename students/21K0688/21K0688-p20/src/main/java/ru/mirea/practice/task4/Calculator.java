package ru.mirea.practice.task4;

public abstract class Calculator {
    public static <T extends Number> double sum(T number1, T number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Number> double multiply(T number1, T number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number> double divide(T number1, T number2) {
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T extends Number> double subtraction(T number1, T number2) {
        return number1.doubleValue() - number2.doubleValue();
    }
}
