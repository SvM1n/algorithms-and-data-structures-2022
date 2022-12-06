package ru.mirea.practice.task1;

public class ArrayQueue<T> {
    private ArrayQueueModule<T> queueModule;

    public void enqueue(T element) {
        queueModule.enqueue(element);
    }

    public T element() {
        return queueModule.element();
    }

    public T dequeue() {
        return queueModule.dequeue();
    }

    public int size() {

        return queueModule.size();

    }

    public boolean isEmpty() {
        return queueModule.isEmpty();
    }

    public void clear() {
        queueModule.clear();
    }

    public boolean isFull() {
        return queueModule.isFull();
    }

    public void display() {
        queueModule.display();
    }


}
