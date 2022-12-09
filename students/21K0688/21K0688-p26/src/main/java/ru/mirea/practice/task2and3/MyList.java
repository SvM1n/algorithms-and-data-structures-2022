package ru.mirea.practice.task2and3;

import java.util.Iterator;


public class MyList<T> {
    private Node head;

    public MyList() {
        head = null;
    }

    public void add(T element) {
        if (element == null) {
            throw new NullPointerException("one of elements is null");
        }
        Node temp = new Node(element);
        Node now = head;
        if (now == null) {
            head = temp;
        } else {
            while (now.next != null) {
                now = now.next;
            }
            now.next = temp;
        }
    }

    public void remove(T element) {
        Node now = head;
        Node prev = null;

        while (now.next != null) {
            if (now.data == element) {
                if (now == head) {
                    head = now.next;
                } else {
                    prev.next = now.next;
                }
            }
            prev = now;
            now = now.next;
        }
    }

    public void print() {
        Node now = head;
        System.out.println(head.data);
        while (now.next != null) {
            now = now.next;
            System.out.println(now.data);
        }
    }

    public Iterator<T> iterator(int index) {
        return new MyListIterator(index);
    }

    private class MyListIterator<T> implements Iterator<T> {
        private Node now = head;
        private int index;

        public MyListIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return now.next != null;
        }

        @Override
        public T next() {
            for (int i = 0; i < index; i++) {
                now = now.next;
            }
            return (T) now.data;
        }
    }
}
