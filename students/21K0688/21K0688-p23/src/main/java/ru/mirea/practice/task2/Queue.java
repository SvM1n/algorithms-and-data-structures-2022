package ru.mirea.practice.task2;

public interface Queue<T> {

    boolean isEmpty();

    void enqueue(T element);

    T element();

    int size();

    void clear();
}
