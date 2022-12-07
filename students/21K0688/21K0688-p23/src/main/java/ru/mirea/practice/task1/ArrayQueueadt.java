package ru.mirea.practice.task1;

public class ArrayQueueadt {
    private int rear;
    private int front;
    private int capacity;
    private Object[] items;

    public ArrayQueueadt(int capacity) {
        this.capacity = capacity;
        rear = -1;
        front = -1;
        items = new Object[capacity];
    }

    public static boolean isFull(ArrayQueueadt adt) {
        return adt.front == 0 && adt.rear == adt.capacity - 1;
    }

    public static boolean isEmpty(ArrayQueueadt adt) {
        return adt.front == -1;
    }

    public static void enqueue(Object element, ArrayQueueadt adt) {
        if (isFull(adt)) {
            System.out.println("Очередь заполнена");
        } else {
            if (adt.front == -1) {
                adt.front = 0;
            }
            adt.rear++;
            adt.items[adt.rear] = element;
            System.out.println("Вставлен " + element);
        }
    }

    public static Object element(ArrayQueueadt adt) {
        return adt.items[adt.front];
    }

    public static Object dequeue(ArrayQueueadt adt) {
        Object firstElement = element(adt);
        if (isEmpty(adt)) {
            System.out.println("Очередь заполнена");
            return null;
        } else {
            if (adt.front >= adt.rear) {
                adt.front = -1;
                adt.rear = -1;
            } else {
                adt.front++;
            }
            System.out.println(firstElement + " Удален");
            return firstElement;
        }
    }

    public static int size(ArrayQueueadt adt) {
        return adt.capacity;
    }

    public static void clear(ArrayQueueadt adt) {
        adt.capacity = 0;
        adt.rear = -1;
        adt.front = -1;
    }
}
