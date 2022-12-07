package mirea.practice.task3.operations;

public class AbstractBinaryOperation<T> {
    protected final Expression<T> leftD;
    protected final Expression<T> rightD;

    public AbstractBinaryOperation(Expression<T> left, Expression<T> right) {
        this.leftD = left;
        this.rightD = right;
    }
}
