package ru.mirea.practice.task1;

public abstract class ArrayQueueModule {
    private static int rear = -1;
    private static int front = -1;
    private static int capacity = 3;
    private static final Object[] items = new Object[capacity];

    public static boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static void enqueue(Object element) {
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Вставлен " + element);
        }
    }

    public static Object element() {
        return items[front];
    }

    public static Object dequeue() {
        Object firstElement = element();
        if (isEmpty()) {
            System.out.println("Очередь заполнена");
            return null;
        } else {
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(firstElement + " Удален");
            return firstElement;
        }
    }

    public static int size() {
        return capacity;
    }

    public static void clear() {
        capacity = 0;
        rear = -1;
        front = -1;
    }
}
