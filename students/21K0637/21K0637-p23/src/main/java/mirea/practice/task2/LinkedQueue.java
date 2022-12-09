package mirea.practice.task2;

public class LinkedQueue extends AbstractQueue implements Queue {
    private int size;
    private Node tail;
    private Node head;

    @Override
    public void enqueue(Object element) {
        tail = new Node(element, null, tail);
        if (head == null) {
            head = tail;
        } else {
            tail.next.prev = tail;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        size--;
        Object tmp = head.value;
        if (head.prev != null) {
            head.prev.next = null;
            head = head.prev;
        }
        return tmp;
    }

    @Override
    public Object peek() {
        return tail.value;
    }

    @Override
    public void push(Object element) {
        head = new Node(element, head, null);
        if (tail == null) {
            tail = head;
        } else {
            head.prev.next = head;
        }
    }

    @Override
    public Object element() {
        return head.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    private static class Node {
        Object value;
        Node next;
        Node prev;

        Node(Object x, Node prev, Node next) {
            this.value = x;
            this.prev = prev;
            this.next = next;
        }
    }
}
