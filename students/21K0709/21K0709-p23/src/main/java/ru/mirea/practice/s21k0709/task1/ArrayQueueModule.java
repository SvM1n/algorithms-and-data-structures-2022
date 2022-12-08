package ru.mirea.practice.s21k0709.task1;

public class ArrayQueueModule<T> {
    private Object[] objects;
    private int capacity;
    protected int front;
    protected int rear;

    public ArrayQueueModule(int capacity) {
        this.objects = new Object[capacity];
        this.capacity = capacity;
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
        objects[rear] = element;
    }


    protected void ensureCapacity() {
        Object[] newElements = new Object[capacity * 2];
        System.arraycopy(objects, 0, newElements, 0, capacity);
        objects = newElements;
    }


    public T element() {
        return (T) objects[front];
    }

    public T dequeue() {
        T firstElement;
        if (!isEmpty()) {
            firstElement = element();
            System.arraycopy(objects, 1, objects, 0, objects.length - 1);
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
        objects = new Object[4];
        front = -1;
        rear = -1;
        capacity = 0;
    }


    public boolean isFull() {
        return front == 0 && rear == capacity - 1 || front == rear + 1;
    }

    public void display() {
        int k;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("\nFront -> " + front);
            System.out.println("Items -> ");
            for (k = front; k != rear; k = (k + 1) % capacity) {
                System.out.print(objects[k] + " ");
            }
            System.out.println(objects[k]);
            System.out.println("\nRear -> " + rear);
        }
    }


}