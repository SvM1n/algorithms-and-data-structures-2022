package ru.mirea.practice.task1;


public class Node {

    public Node next;
    public Student data;

    public Node(Student data) {
        this.next = null;
        this.data = data;
    }
}
