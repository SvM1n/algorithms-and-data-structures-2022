package mirea.practice.task4;

import java.util.stream.Stream;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T minValue() {
        return Stream.of(array).min(Comparable::compareTo).get();
    }

    public T maxValue() {
        return Stream.of(array).max(Comparable::compareTo).get();
    }
}
