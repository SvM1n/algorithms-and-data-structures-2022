package ru.mirea.worktwentythree.task3;

public class Const implements DoubleExpression, Expression {
    public final double k;

    public Const(double x) {
        k = x;
    }

    @Override
    public double evaluate(double x) {
        return k;
    }

    @Override
    public int evaluate(int x) {
        return (int) k;
    }
}
