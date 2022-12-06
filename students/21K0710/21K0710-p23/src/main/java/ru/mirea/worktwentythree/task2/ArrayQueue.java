package ru.mirea.worktwentythree.task2;

public class ArrayQueue extends AbstractQueue {
    int size = 5;
    int[] items = new int[size];
    int front;
    int rear;

    ArrayQueue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return front == 0
                && rear == size - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enqueue(int element) {
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

    int dequeue() {
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
            System.out.println(element + " Deleted");
            return element;
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.print("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index-> " + rear);
        }
    }

    public int size() {
        return size;
    }
}
