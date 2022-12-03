package mirea.practice.task1;

import java.util.Arrays;

public abstract class ArrayQueueModule {
    private static final int DEFAULT_SIZE = 10;
    private static Object[] array = new Object[DEFAULT_SIZE];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    private static void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length << 1];
            int count;
            if (tail < head) {
                count = array.length - head;
            } else {
                count = size;
            }
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head) {
                System.arraycopy(array, 0, temp, count, tail);
            }
            array = temp;
            head = 0;
            tail = size;
        }
    }

    public static void push(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        if (head == 0) {
            head = array.length - 1;
        } else {
            head -= 1;
        }
        array[head] = element;
        size++;
    }

    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public static Object element() {
        assert size > 0;
        return array[head];
    }

    public static Object dequeue() {
        size--;
        assert size > 0;
        Object result = element();
        array[head] = null;
        head = (head + 1) % array.length;
        return result;
    }

    public static Object peek() {
        assert size > 0;
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    public static void clear() {
        size = head = tail = 0;
        array = new Object[DEFAULT_SIZE];
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
