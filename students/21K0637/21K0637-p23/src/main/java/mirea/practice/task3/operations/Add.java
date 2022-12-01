package mirea.practice.task3.operations;

public class Add<T extends Number> extends AbstractBinaryOperation<T> implements Expression<T> {
    public Add(Expression<T> left, Expression<T> right) {
        super(left, right);
    }

    @Override
    public T evaluate(T x) {
        return (T) Double.valueOf(leftD.evaluate(x).doubleValue() + rightD.evaluate(x).doubleValue());
    }
}
