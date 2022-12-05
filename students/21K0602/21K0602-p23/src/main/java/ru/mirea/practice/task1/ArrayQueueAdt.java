package ru.mirea.practice.task1;

public class ArrayQueueAdt<T> {


    public void enqueue(T element, ArrayQueueModule<T> queueModule) {
        queueModule.enqueue(element);
    }



    public T element(ArrayQueueModule<T> queueModule) {
        return queueModule.element();
    }

    public T dequeue(ArrayQueueModule<T> queueModule) {
        return queueModule.dequeue();

    }

    public int size(ArrayQueueModule<T> queueModule) {
        return queueModule.size();

    }

    public boolean isEmpty(ArrayQueueModule<T> queueModule) {
        return queueModule.isEmpty();
    }

    public void clear(ArrayQueueModule<T> queueModule) {
        queueModule.clear();
    }


    public boolean isFull(ArrayQueueModule<T> queueModule) {
        return queueModule.isFull();
    }

    public void display(ArrayQueueModule<T> queueModule) {
        queueModule.display();
    }


}
