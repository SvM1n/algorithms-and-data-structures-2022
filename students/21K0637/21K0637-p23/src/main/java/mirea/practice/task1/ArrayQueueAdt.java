package mirea.practice.task1;

import java.util.Arrays;

public class ArrayQueueAdt {
    private static final int DEFAULT_SIZE = 10;
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueAdt() {
        this.array = new Object[DEFAULT_SIZE];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    private void ensureCapacity(int capacity) {
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
        assert size > 0;
        size--;
        Object result = element();
        array[head] = null;
        head = (head + 1) % array.length;
        return result;
    }

    public void push(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        if (head == 0) {
            head = array.length - 1;
        } else {
            head--;
        }
        array[head] = element;
        size++;
    }

    public Object peek() {
        assert size > 0;
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    public Object remove(ArrayQueueAdt adt) {
        assert adt.size > 0;
        adt.size--;
        Object result = peek();
        adt.tail = (adt.tail == 0) ? adt.array.length - 1 : adt.tail - 1;
        adt.array[adt.tail] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        head = 0;
        tail = 0;
        array = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
