package ru.mirea.practice.n1;

abstract class ArrayQueueAdt {
    private int size;
    private int[] elements;
    private int front;
    private int rear;

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int[] getElements() {
        return elements;
    }

    abstract int getElement(int i);

    abstract boolean isFull();

    abstract boolean isEmpty();

    abstract void enqueue(int element);

    abstract int dequeue();

    abstract void element();

    abstract void size();

    abstract void clear();

    abstract void display();
}
