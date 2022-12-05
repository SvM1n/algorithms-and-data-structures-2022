package ru.mirea.worktwentythree.task3;

public class Variable implements DoubleExpression, Expression {
    public String a;

    public Variable(String b) {
        a = b;
    }

    @Override
    public double evaluate(double x) {
        return x;
    }

    @Override
    public int evaluate(int x) {
        return x;
    }
}
