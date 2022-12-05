package ru.mirea.worktwentythree.task2;

public class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        assert value != null;
        this.value = value;
        this.next = next;
    }
}
