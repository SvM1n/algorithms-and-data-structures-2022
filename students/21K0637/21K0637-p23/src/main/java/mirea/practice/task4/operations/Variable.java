package mirea.practice.task4.operations;

public class Variable<T extends Number> implements Expression<T> {
    public char value;

    public Variable(char b) {
        value = b;
    }

    @Override
    public T evaluate(T... x) {
        if (value == 'x') {
            return x[0];
        } else {
            if (value == 'y') {
                return x[1];
            } else {
                return x[2];
            }
        }
    }
}
