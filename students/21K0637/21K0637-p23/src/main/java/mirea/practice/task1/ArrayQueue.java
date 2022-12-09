package mirea.practice.task1;

import java.util.Arrays;

public class ArrayQueue {
    private static final int DEFAULT_SIZE = 10;
    private Object[] array;
    private int size;

    public ArrayQueue() {
        array = new Object[DEFAULT_SIZE];
        size = 0;
    }

    public ArrayQueue(Object[] array) {
        this.array = array;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > array.length) {
            array = Arrays.copyOf(array, capacity * 2);
        }
    }

    public Object pop() {
        assert size > 0;
        Object value = peek();
        array[size--] = 0;
        return value;
    }

    public Object peek() {
        assert size > 0;
        return array[size - 1];
    }

    public void push(Object element) {
        assert element != null;

        ensureCapacity(size + 1);
        array[size++] = element;
    }

    public int size() {
        return size;
    }

    public ArrayQueue copy() {
        return new ArrayQueue(array);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}