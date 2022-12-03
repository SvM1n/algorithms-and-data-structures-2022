package ru.mirea.practice.task4;

public class MinMax<T extends Comparable> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public T max() {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
