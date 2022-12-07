package mirea.practice.task4.operations;

public interface Expression<T extends Number> {
    T evaluate(T... x);
}
