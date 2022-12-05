package ru.mirea.practice.task1;

public class ArrayQueueModule<T> {
    private int capacity;
    protected int front;
    protected int rear;
    private Object[] elements;

    public ArrayQueueModule(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(T element) {
        if (isFull()) {
            ensureCapacity();
        }
        capacity++;
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = element;


    }


    protected void ensureCapacity() {
        Object[] newElements = new Object[capacity * 2];
        System.arraycopy(elements, 0, newElements, 0, capacity);
        elements = newElements;
    }


    public T element() {
        return (T) elements[front];
    }

    public T dequeue() {
        T firstElement;
        if (!isEmpty()) {
            firstElement = element();
            System.arraycopy(elements, 1, elements, 0, elements.length - 1);
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            return firstElement;
        } else {
            return null;
        }

    }

    public int size() {
        return capacity;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void clear() {
        elements = new Object[5];
        front = -1;
        rear = -1;
        capacity = 0;
    }


    public boolean isFull() {
        return front == 0 && rear == capacity - 1 || front == rear + 1;
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(elements[i] + " ");
            }
            System.out.println(elements[i]);
            System.out.println("Rear -> " + rear);
        }
    }


}
