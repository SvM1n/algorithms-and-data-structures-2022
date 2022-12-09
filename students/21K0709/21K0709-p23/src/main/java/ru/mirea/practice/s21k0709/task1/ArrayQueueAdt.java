package ru.mirea.practice.s21k0709.task1;

public class ArrayQueueAdt<T> {
    public void enqueue(T element, ArrayQueueModule<T> arrayQueueModule) {
        arrayQueueModule.enqueue(element);
    }

    public T element(ArrayQueueModule<T> arrayQueueModule) {
        return arrayQueueModule.element();
    }

    public T dequeue(ArrayQueueModule<T> arrayQueueModule) {
        return arrayQueueModule.dequeue();

    }

    public int size(ArrayQueueModule<T> arrayQueueModule) {
        return arrayQueueModule.size();

    }

    public boolean isEmpty(ArrayQueueModule<T> arrayQueueModule) {
        return arrayQueueModule.isEmpty();
    }

    public void clearQueue(ArrayQueueModule<T> arrayQueueModule) {
        arrayQueueModule.clear();
    }


    public boolean isFull(ArrayQueueModule<T> arrayQueueModule) {
        return arrayQueueModule.isFull();
    }

    public void showDisplay(ArrayQueueModule<T> arrayQueueModule) {
        arrayQueueModule.display();
    }

}