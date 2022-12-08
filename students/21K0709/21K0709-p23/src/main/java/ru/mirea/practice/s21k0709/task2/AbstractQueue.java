package ru.mirea.practice.s21k0709.task2;

abstract class AbstractQueue {
    abstract void enqueue(int elem);

    abstract void element();

    abstract int dequeue();

    abstract int getSize();

    abstract boolean isEmpty();

    abstract void clear();
}