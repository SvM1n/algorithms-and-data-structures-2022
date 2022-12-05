package ru.mirea.practice.task2to3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class UserList<T> implements Iterable<T> {

    private Node head;
    private int size;

    public UserList() {
        head = null;
        size = 0;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T item) throws NullPointerException {
        if (item == null) {
            throw new NullPointerException("item to add is null");

        }
        Node node = new Node<>(item);
        Node curr = head;
        if (head == null) {
            head = node;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        size++;
    }

    public boolean remove(Object data) throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("cannot remove from empty list");
        }
        Node curr = head;
        Node prev = null;
        while (curr.next != null) {

            if (curr.data == data) {
                if (curr == head) {
                    if (size == 1) {
                        head = null;
                    } else {
                        head = head.next;
                    }

                } else {
                    prev.next = curr.next;
                }
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }

        return false;
    }

    public void clear() {
        head = null;
        size = 0;
    }


    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator<T> implements Iterator<T> {
        private Node current = head;

        @Override
        public T next() throws NoSuchElementException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = (T) current.data;
            current = current.next;
            return item;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

    }


}
