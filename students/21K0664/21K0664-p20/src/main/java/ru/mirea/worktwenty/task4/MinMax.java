package ru.mirea.worktwenty.task4;

public class MinMax<K> {

    private final K[] arr;

    MinMax(K[] arr1) {
        arr = arr1;
    }

    public K findMax() {
        K max = arr[0];
        for (K k : arr) {
            if ((Integer) k > (Integer) max) {
                max = k;
            }
        }
        return max;

    }

    public K findMin() {
        K min = arr[0];
        for (K k : arr) {
            if ((Integer) k < (Integer) min) {
                min = k;
            }
        }
        return min;

    }

}
