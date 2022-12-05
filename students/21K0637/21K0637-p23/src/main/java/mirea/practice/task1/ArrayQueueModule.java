package mirea.practice.task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static final int DEFAULT_SIZE = 10;
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueModule() {
        this.array = new Object[DEFAULT_SIZE];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= this.array.length) {
            Object[] temp = new Object[array.length << 1];
            int count;
            count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head) {
                System.arraycopy(array, 0, temp, count, tail);
            }
            array = temp;
            head = 0;
            tail = size;
        }
    }

    public void push(Object element) {
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

    public void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Object element() {
        assert size > 0;
        return array[head];
    }

    public Object dequeue() {
        size--;
        assert size > 0;
        Object result = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        return result;
    }

    public Object peek() {
        assert size > 0;
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    public void clear() {
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
