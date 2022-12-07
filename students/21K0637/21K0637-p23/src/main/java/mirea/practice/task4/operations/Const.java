package mirea.practice.task4.operations;

public class Const<T extends Number> implements Expression<T> {
    public final T value;

    public Const(T x) {
        value = x;
    }

    @Override
    public T evaluate(T... x) {
        return value;
    }
}
