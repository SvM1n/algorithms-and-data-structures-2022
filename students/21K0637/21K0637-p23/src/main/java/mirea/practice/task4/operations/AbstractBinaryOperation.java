package mirea.practice.task4.operations;

public class AbstractBinaryOperation<T extends Number> {
    protected final Expression<T> leftD;
    protected final Expression<T> rightD;

    public AbstractBinaryOperation(Expression<T> left, Expression<T> right) {
        this.leftD = left;
        this.rightD = right;
    }
}
