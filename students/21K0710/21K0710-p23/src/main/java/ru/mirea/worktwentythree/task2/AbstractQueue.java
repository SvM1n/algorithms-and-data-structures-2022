package ru.mirea.worktwentythree.task2;

public abstract class AbstractQueue {

    abstract int size();

    abstract void enqueue(int element);

    abstract int dequeue();
}
