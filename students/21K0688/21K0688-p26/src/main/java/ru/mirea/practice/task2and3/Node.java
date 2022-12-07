package ru.mirea.practice.task2and3;

public class Node<T> {
    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}
