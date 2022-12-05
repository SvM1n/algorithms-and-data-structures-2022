package ru.mirea.worktwentythree.task1;

public abstract class ArrayQueueModule {
    private static int size = 0;
    private static int head = 0;
    private static Object[] elements = new Object[5];

    public void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        if (head == 0) {
            if (size >= 0) {
                System.arraycopy(elements, 0, newElements, 0, size);
            }
            elements = newElements;
        } else {
            if (elements.length - head >= 0) {
                System.arraycopy(elements, head, newElements, 0, elements.length - head);
            }
            if ((head + size) % elements.length + 1 >= 0) {
                System.arraycopy(elements, 0, newElements, elements.length - head, (head + size) % elements.length + 1);
            }
            head = 0;
            elements = newElements;
        }
    }

    public static Object dequeue() {
        assert size > 0;
        Object x = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return x;
    }

    public static Object element() {
        assert size > 0;
        return elements[head];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elements = new Object[5];
        size = 0;
        head = 0;
    }

    public static String toStr() {
        StringBuilder str = new StringBuilder("[");
        if (size == 0) {
            return "[]";
        }
        if (head < (head + size) % elements.length) {
            for (int i = head; i < (head + size) % elements.length; i++) {
                str.append(elements[i].toString());
                str.append(", ");
            }
        } else {
            for (int i = head; i < elements.length; i++) {
                str.append(elements[i].toString());
                str.append(", ");
            }
            for (int i = 0; i < (head + size) % elements.length; i++) {
                str.append(elements[i].toString());
                str.append(", ");
            }
        }
        str.delete(str.length() - 2, str.length());
        str.insert(str.length(), ']');
        return str.toString();
    }


}
