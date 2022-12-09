package ru.mirea.practice.n1;

public class ArrayQueue {
    private int size = 5;
    private int[] elements = new int[size];
    private int front;
    private int rear;

    ArrayQueue() {
        front = -1;
        rear = -1;
    }

    public int getSize() {

        return size;
    }

    public int getElement(int i) {

        return elements[i];
    }

    public boolean isFull() {

        return front == 0 && rear == size - 1;
    }

    public boolean isEmpty() {

        return front == -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            elements[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = elements[front];
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

    public void element() {

        System.out.println("First element " + elements[0]);
    }

    public void size() {

        System.out.println("Size " + elements.length);
    }

    public void clear() {
        System.out.println("Queue cleaned");
        elements = new int[0];
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("elements -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(elements[i] + " ");
            }
            System.out.println("\nRear index-> " + rear);
        }
    }
}
