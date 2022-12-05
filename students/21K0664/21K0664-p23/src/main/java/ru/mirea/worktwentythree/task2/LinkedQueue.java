package ru.mirea.worktwentythree.task2;

public class LinkedQueue extends AbstractQueue implements Queue {

    private Node head;
    private Node tail;

    @Override
    protected void enqueueImpl(Object element) {
        Node key = tail;
        tail = new Node(element, null);
        if (size == 0) {
            head = tail;
        } else {
            key.next = tail;
        }
    }

    @Override
    protected Object[] toArrayImpl(Object[] newElements) {
        newElements[0] = head.value;
        Node key = head.next;
        for (int i = 1; i < size; i++) {
            newElements[i] = key.value;
            key = key.next;
        }
        return newElements;
    }

    @Override
    protected void remove() {
        head = head.next;
    }

    @Override
    protected Object elementImpl() {
        return head.value;
    }

    @Override
    protected void clearImpl() {
        System.out.println("Cleared");
    }

}
