package ru.mirea.practice.task2;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    int size();

    boolean isEmpty();

    void clear();

    T element();
}
