package ru.mirea.practice.task4;

public class MinMax<T extends Comparable> {
    private T[] massive;

    public MinMax(T[] massive) {
        this.massive = massive;
    }

    public T getMin() {
        T min = massive[0];
        for (int i = 1; i < massive.length; i++) {
            if (massive[i].compareTo(min) < 0) {
                min = massive[i];
            }
        }
        return min;
    }

    public T getMax() {
        T max = massive[0];
        for (int i = 1; i < massive.length; i++) {
            if (massive[i].compareTo(max) > 0) {
                max = massive[i];
            }
        }
        return max;
    }
}
