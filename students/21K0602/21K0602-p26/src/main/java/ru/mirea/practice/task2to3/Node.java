package ru.mirea.practice.task2to3;

public class Node<T> {

    public Node next;

    public T data;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }
}
