package mirea.practice.task3.operations;

public class Variable<T extends Number> implements Expression<T> {
    public String a;

    public Variable(String b) {
        a = b;
    }

    @Override
    public T evaluate(T x) {
        return x;
    }
}
