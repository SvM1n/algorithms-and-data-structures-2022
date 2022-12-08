package ru.mirea.practice.task3;


public class Node<T> {
    Node<T> next;

    Node<T> previous;

    T value;


    public Node(T value, Node<T> next, Node<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }



}
