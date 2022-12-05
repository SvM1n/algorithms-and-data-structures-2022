package ru.mirea.practice.task2;

public class LinkedQueue<T> extends AbstractQueue<T> implements Queue<T> {
    private int capacity;
    private Node<T> front;
    private Node<T> rear;

    public LinkedQueue() {
        capacity = 0;
        front = null;
        rear = null;
    }

    @Override
    public void enqueue(T element) {
        Node<T> temp = rear;
        rear = new Node<>(element, null);
        if (capacity == 0) {
            front = temp;
            capacity++;
        }

    }

    @Override
    public T dequeue() {
        if (front == null) {
            return null;
        }
        T value;
        if (front == rear) {
            value = front.data;
            clear();
        } else {
            value = front.data;
            front = front.next;
            rear.next = front;
        }
        capacity--;
        return value;
    }

    @Override
    public int size() {
        return capacity;
    }


    @Override
    public boolean isEmpty() {
        return front == null;
    }


    @Override
    public void clear() {
        front = null;
        rear = null;
        capacity = 0;

    }

    @Override
    public T element() {
        return front.data;
    }
}
