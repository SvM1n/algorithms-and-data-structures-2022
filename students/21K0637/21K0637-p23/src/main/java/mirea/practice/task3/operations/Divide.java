package mirea.practice.task3.operations;

public class Divide<T extends Number> extends AbstractBinaryOperation<T> implements Expression<T> {
    public Divide(Expression<T> left, Expression<T> right) {
        super(left, right);
    }

    @Override
    public T evaluate(T x) {
        return (T) Double.valueOf(leftD.evaluate(x).doubleValue() / rightD.evaluate(x).doubleValue());
    }
}
