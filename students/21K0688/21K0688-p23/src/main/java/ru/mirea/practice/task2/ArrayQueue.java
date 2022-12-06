package ru.mirea.practice.task2;

public class ArrayQueue extends AbstractQueue {
    private static final int startCapacity = 100;
    private Object[] arr;
    private int head;
    private int tail;

    public ArrayQueue() {
        arr = new Object[startCapacity];
        head = tail = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= arr.length) {
            Object[] temp = new Object[arr.length << 1];
            int count = tail < head ? arr.length - head : size;
            System.arraycopy(arr, head, temp, 0, count);
            if (tail < head) {
                System.arraycopy(arr, 0, temp, count, tail);
            }
            arr = temp;
            head = 0;
            tail = size;
        }

    }

    @Override
    protected void enqueueRealisation(Object element) {
        ensureCapacity(size + 1);
        arr[tail] = element;
        tail = (tail + 1) % arr.length;
    }

    @Override
    public Object elementRealisation() {
        return arr[head];
    }

    @Override
    protected void dequeueRealisation() {
        arr[head] = null;
        head = (head + 1) % arr.length;
    }

    protected void pushRealisation(Object element) {
        ensureCapacity(size + 1);
        head = this.head - 1 >= 0 ? arr.length - 1 : head - 1;
        arr[head] = element;
    }

    protected Object peekRealisation() {
        return arr[(tail == 0) ? arr.length - 1 : tail - 1];
    }

    protected void removeRealisation() {
        tail = tail == 0 ? arr.length - 1 : --tail;
        arr[tail] = null;
    }
}
