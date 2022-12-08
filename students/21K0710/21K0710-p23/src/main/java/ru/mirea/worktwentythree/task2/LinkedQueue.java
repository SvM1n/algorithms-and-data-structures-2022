package ru.mirea.worktwentythree.task2;

public class LinkedQueue extends AbstractQueue {
    private static int count = 0;
    private Node rear = null;
    private Node front = null;

    public int dequeue() {
        if (front == null) {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }
        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count -= 1;
        return temp.data;
    }

    public void enqueue(int item) {
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        count += 1;
    }

    public boolean isEmpty() {
        return rear == null && front == null;
    }

    public int size() {
        return count;
    }
}
