package mirea.practice.task4.operations;

public class Multiply<T extends Number> extends AbstractBinaryOperation<T> implements Expression<T> {

    public Multiply(Expression<T> left, Expression<T> right) {
        super(left, right);
    }

    @Override
    public T evaluate(T... x) {
        return (T) Double.valueOf(leftD.evaluate(x).doubleValue() * rightD.evaluate(x).doubleValue());
    }
}
