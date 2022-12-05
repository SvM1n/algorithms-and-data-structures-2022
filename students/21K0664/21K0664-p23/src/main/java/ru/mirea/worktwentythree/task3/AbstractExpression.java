package ru.mirea.worktwentythree.task3;

public abstract class AbstractExpression implements DoubleExpression, Expression {
    protected AbstractExpression() {
        System.out.println(" ");
    }

    DoubleExpression leftD;
    DoubleExpression rightD;
}
