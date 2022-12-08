package ru.mirea.practice.s21k0709.task2;

import java.util.AbstractQueue;
import java.util.Iterator;

public class ArrayQueue extends AbstractQueue {
    private int[] itemsQueue;
    private static int size = 4;
    private int front;
    private int rear;

    public ArrayQueue() {
        front = -1;
        rear = -1;
        itemsQueue = new int[size];
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int elem) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            itemsQueue[rear] = elem;
            System.out.println("Insert " + elem);
        }
    }

    public int dequeue() {
        int obj;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            obj = itemsQueue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(obj + "Deleted ");
            return obj;
        }
    }

    public void showDisplay() {
        int k;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (k = front; k <= rear; k++) {
                System.out.print(itemsQueue[k] + " ");
            }
            System.out.println("\nRear index-> " + rear);
        }
    }

    public Object element() {
        if (front != -1) {
            System.out.println("First element of queue " + itemsQueue[0]);
        } else {
            System.out.println("Queue is empty");
            return 0;
        }
        return itemsQueue[0];
    }

    @Override
    public Object peek() {
        return null;
    }

    public int getSize() {
        System.out.println("Size queue " + itemsQueue.length);
        return itemsQueue.length;
    }

    public void clear() {
        itemsQueue = new int[0];
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }
}