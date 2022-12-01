package mirea.practice.task3.operations;

public class Const<T extends Number> implements Expression<T> {
    private final T value;

    public Const(T value) {
        this.value = value;
    }

    @Override
    public T evaluate(T x) {
        return value;
    }
}
