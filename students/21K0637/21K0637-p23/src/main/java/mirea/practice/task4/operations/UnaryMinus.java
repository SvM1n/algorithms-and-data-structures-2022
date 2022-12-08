package mirea.practice.task4.operations;

public class UnaryMinus<T extends Number> implements Expression<T> {
    Expression<T> rightD;

    public UnaryMinus(Expression<T> x) {
        rightD = x;
    }

    @Override
    public T evaluate(T... x) {
        return (T) Double.valueOf(rightD.evaluate(x).doubleValue() * -1);
    }
}
