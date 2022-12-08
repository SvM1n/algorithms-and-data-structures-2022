package ru.mirea.worktwentythree.task1;

public class ArrayQueue {
    int size = 5;
    int[] items = new int[size];
    int front;
    int rear;

    ArrayQueue() {
        front = -1;
        rear = -1;
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.deQueue();
        for (int i = 1; i < 6; i++) {
            q.enQueue(i);
        }
        q.enQueue(6);
        q.display();
        q.deQueue();
        q.display();
    }

    boolean isFull() {
        return front == 0
                && rear == size - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    // Pre: rear != size
    // Pre: front == -1
    // Post: front = 0
    // Post: rear = rear + 1
    // Post: queue[rear] = element
    void enQueue(int element) {
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

    // Pre: rear != size
    // Pre: front >= rear
    // Post: front = 0
    // Post: rear = rear + 1
    // Post: queue[rear] = element
    int deQueue() {
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
}
