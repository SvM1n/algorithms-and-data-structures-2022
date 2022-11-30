package mirea.practice.task4;

public abstract class Calculator {
    public static <T extends Number, V extends Number> Double sum(T left, V right) {
        return left.doubleValue() + right.doubleValue();
    }

    public static <T extends Number, V extends Number> Double multiply(T left, V right) {
        return  left.doubleValue() * right.doubleValue();
    }

    public static <T extends Number, V extends Number> Double divide(T left, V right) {
        return left.doubleValue() / right.doubleValue();
    }

    public static <T extends Number, V extends Number> Double subtraction(T left, V right) {
        return left.doubleValue() - right.doubleValue();
    }
}
