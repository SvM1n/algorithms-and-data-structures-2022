package ru.mirea.practice.solutiontask1;

public class ArrayQueueModule<T> {
    private static int size = 5;
    private Object[] items;
    private int front;
    private int rear;

    public ArrayQueueModule() {
        items = new Object[size];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(T element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    public T dequeue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + "Deleted");
            return (T) element;
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index-> " + rear);
        }
    }

    public T element() {
        return (T) items[0];
    }

    public int size() {
        System.out.println("Размер очереди " + items.length);
        return items.length;
    }

    public void clear() {
        items = new Object[size];
        front = -1;
        rear = -1;
    }
}
