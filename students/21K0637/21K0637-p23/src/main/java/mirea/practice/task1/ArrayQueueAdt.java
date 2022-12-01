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

    private static void ensureCapacity(ArrayQueueAdt adt, int capacity) {
        if (capacity >= adt.array.length) {
            Object[] temp = new Object[adt.array.length << 1];
            int count;
            if (adt.tail < adt.head) {
                count = adt.array.length - adt.head;
            } else {
                count = adt.size;
            }
            System.arraycopy(adt.array, adt.head, temp, 0, count);
            if (adt.tail < adt.head) {
                System.arraycopy(adt.array, 0, temp, count, adt.tail);
            }
            adt.array = temp;
            adt.head = 0;
            adt.tail = adt.size;
        }
    }

    public static void enqueue(ArrayQueueAdt adt, Object element) {
        assert element != null;
        ensureCapacity(adt, adt.size + 1);
        adt.array[adt.tail] = element;
        adt.tail = (adt.tail + 1) % adt.array.length;
        adt.size++;
    }

    public static Object element(ArrayQueueAdt adt) {
        assert adt.size > 0;
        return adt.array[adt.head];
    }

    public static Object dequeue(ArrayQueueAdt adt) {
        assert adt.size > 0;
        adt.size--;
        Object result = element(adt);
        adt.array[adt.head] = null;
        adt.head = (adt.head + 1) % adt.array.length;
        return result;
    }

    public static void push(ArrayQueueAdt adt, Object element) {
        assert element != null;
        ensureCapacity(adt, adt.size + 1);
        if (adt.head == 0) {
            adt.head = adt.array.length - 1;
        } else {
            adt.head--;
        }
        adt.array[adt.head] = element;
        adt.size++;
    }

    public static Object peek(ArrayQueueAdt adt) {
        assert adt.size > 0;
        return adt.array[(adt.tail == 0) ? adt.array.length - 1 : adt.tail - 1];
    }

    public static Object remove(ArrayQueueAdt adt) {
        assert adt.size > 0;
        adt.size--;
        Object result = peek(adt);
        adt.tail = (adt.tail == 0) ? adt.array.length - 1 : adt.tail - 1;
        adt.array[adt.tail] = null;
        return result;
    }

    public static int size(ArrayQueueAdt adt) {
        return adt.size;
    }

    public static boolean isEmpty(ArrayQueueAdt adt) {
        return adt.size == 0;
    }

    public static void clear(ArrayQueueAdt adt) {
        adt.size = 0;
        adt.head = 0;
        adt.tail = 0;
        adt.array = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
