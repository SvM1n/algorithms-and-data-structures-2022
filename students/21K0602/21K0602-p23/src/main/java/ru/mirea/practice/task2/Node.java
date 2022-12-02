package ru.mirea.practice.task2;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        next = nextNode;
    }
}
