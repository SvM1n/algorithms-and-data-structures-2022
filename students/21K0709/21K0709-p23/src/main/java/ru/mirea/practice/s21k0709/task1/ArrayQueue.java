package ru.mirea.practice.s21k0709.task1;

public class ArrayQueue<T> {
    private ArrayQueueModule<T> arrayQueueModule;

    public void enqueue(T element) {
        arrayQueueModule.enqueue(element);
    }

    public T element() {
        return arrayQueueModule.element();
    }

    public T dequeue() {
        return arrayQueueModule.dequeue();
    }

    public int size() {
        return arrayQueueModule.size();
    }

    public boolean isEmpty() {
        return arrayQueueModule.isEmpty();
    }

    public void clear() {
        arrayQueueModule.clear();
    }

    public boolean isFull() {
        return arrayQueueModule.isFull();
    }

    public void showDisplay() {
        arrayQueueModule.display();
    }
}
