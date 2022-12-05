package ru.mirea.worktwentythree.task1;

public class ArrayQueueadt {

    private int size = 0;
    private int head = 0;
    private Object[] elements = new Object[5];


    public void enqueue(ArrayQueueadt queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[(queue.head + queue.size) % queue.elements.length] = element;
        queue.size++;
    }

    private void ensureCapacity(ArrayQueueadt queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        if (queue.head == 0) {
            if (queue.size >= 0) {
                System.arraycopy(queue.elements, 0, newElements, 0, queue.size);
            }
        } else {
            if (queue.elements.length - queue.head >= 0) {
                System.arraycopy(queue.elements, queue.head, newElements, 0, queue.elements.length - queue.head);
            }
            if ((queue.head + queue.size) % queue.elements.length + 1 >= 0) {
                System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.head,
                        (queue.head + queue.size) % queue.elements.length + 1);
            }
            queue.head = 0;
        }
        queue.elements = newElements;
    }

    public Object dequeue(ArrayQueueadt queue) {
        assert queue.size > 0;
        Object x = queue.elements[queue.head];
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return x;
    }

    public static Object element(ArrayQueueadt queue) {
        assert queue.size > 0;
        return queue.elements[queue.head];
    }


    public static int size(ArrayQueueadt queue) {
        return queue.size;
    }


    public static boolean isEmpty(ArrayQueueadt queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueadt queue) {
        queue.elements = new Object[5];
        queue.size = 0;
        queue.head = 0;
    }

    public static String toStr(ArrayQueueadt queue) {
        StringBuilder str = new StringBuilder("[");
        if (queue.size == 0) {
            return "[]";
        }
        if (queue.head < (queue.head + queue.size) % queue.elements.length) {
            for (int i = queue.head; i < (queue.head + queue.size) % queue.elements.length; i++) {
                str.append(queue.elements[i].toString());
                str.append(", ");
            }
        } else {
            for (int i = queue.head; i < queue.elements.length; i++) {
                str.append(queue.elements[i].toString());
                str.append(", ");
            }
            for (int i = 0; i < (queue.head + queue.size) % queue.elements.length; i++) {
                str.append(queue.elements[i].toString());
                str.append(", ");
            }
        }
        str.delete(str.length() - 2, str.length());
        str.insert(str.length(), ']');
        return str.toString();
    }

    public static void main(String[] args) {
        ArrayQueueadt queue = new ArrayQueueadt();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(queue, i);
        }
        System.out.println(ArrayQueueadt.toStr(queue));

        for (int i = 0; i < 5; i++) {
            queue.dequeue(queue);
        }
        System.out.println(ArrayQueueadt.toStr(queue));

        for (int i = 0; i < 5; i++) {
            queue.enqueue(queue, i);
        }
        System.out.println(ArrayQueueadt.toStr(queue));

        for (int i = 100; i < 108; i++) {
            queue.enqueue(queue, i);
        }
        System.out.println(ArrayQueueadt.toStr(queue));
    }
}
