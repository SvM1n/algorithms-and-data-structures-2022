package ru.mirea.practice.task2;

public class Node<T> {
    T data;
    Node next;

    public Node(T data, Node nextNode) {
        this.data = data;
        next = nextNode;
    }
}
