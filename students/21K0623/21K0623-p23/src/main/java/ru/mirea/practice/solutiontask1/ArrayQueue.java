package ru.mirea.practice.solutiontask1;

public class ArrayQueue {
    private static int size = 5;
    private int[] items = new int[size];
    private int front;
    private int rear;

    public ArrayQueue() {
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int element) {
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

    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + "Deleted");
            return element;
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

    public void element() {
        if (front != -1) {
            System.out.println("Самый первый элемент в очереди " + items[0]);
        } else {
            System.out.println("Очередь пустая");
        }
    }

    public int size() {
        System.out.println("Размер очереди " + items.length);
        return items.length;
    }

    public void clear() {
        items = new int[0];
    }
}
