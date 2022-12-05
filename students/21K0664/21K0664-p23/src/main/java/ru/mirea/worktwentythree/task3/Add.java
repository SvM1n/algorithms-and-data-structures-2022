package ru.mirea.worktwentythree.task3;

public class Add extends AbstractExpression implements DoubleExpression, Expression {

    public Add(DoubleExpression x, DoubleExpression y) {
        leftD = x;
        rightD = y;
    }

    @Override
    public double evaluate(double x) {
        return (double) leftD.evaluate(x) + (double) rightD.evaluate(x);
    }

    @Override
    public int evaluate(int x) {
        return (int) leftD.evaluate(x) + (int) rightD.evaluate(x);
    }
}
