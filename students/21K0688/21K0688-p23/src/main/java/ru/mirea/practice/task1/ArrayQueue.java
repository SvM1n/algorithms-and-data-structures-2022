package ru.mirea.practice.task1;

public class ArrayQueue {
    private int rear;
    private int front;
    private int capacity;
    private Object[] items;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        items = new Object[capacity];
    }

    public boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    public void enqueue(Object element) {
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

    public Object dequeue() {
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

    public Object element() {
        return items[front];
    }

    public int size() {
        return capacity;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public void clear() {
        capacity = 0;
        rear = -1;
        front = -1;
    }

}
