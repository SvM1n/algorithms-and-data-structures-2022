package ru.mirea.practice.task4;

public abstract class Calculator {

    public static <T extends Number> double sum(T number1, T number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Number> double multiply(T number1, T number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number> double divide(T number1, T number2) {
        if (number2.doubleValue() != 0.0) {
            return number1.doubleValue() + number2.doubleValue();
        }
        return number1.doubleValue();
    }

    public static <T extends Number> double substraction(T number1, T number2) {
        return number1.doubleValue() - number2.doubleValue();
    }

}
