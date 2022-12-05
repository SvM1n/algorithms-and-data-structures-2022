package ru.mirea.practice.task2;

public class ArrayQueue<T> extends AbstractQueue<T> implements Queue<T> {

    private int currentCapacity;
    private final int startCapacity;
    protected int front;
    protected int rear;
    private Object[] elements;

    public ArrayQueue() {

        this.currentCapacity = 0;
        front = -1;
        rear = -1;
        startCapacity = 5;
        elements = new Object[startCapacity];
    }

    protected void ensureCapacity() {
        Object[] newElements = new Object[currentCapacity * 2];
        System.arraycopy(elements, 0, newElements, 0, currentCapacity);
        elements = newElements;
    }


    public boolean isFull() {
        return front == 0 && rear == currentCapacity - 1 || front == rear + 1;
    }

    @Override
    public void enqueue(T element) {
        if (isFull()) {
            ensureCapacity();
        }
        currentCapacity++;
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % currentCapacity;
        elements[rear] = element;
    }

    @Override
    public T dequeue() {
        T firstElement;
        if (!isEmpty()) {
            firstElement = element();
            System.arraycopy(elements, 1, elements, 0, elements.length - 1);
            if (front == rear) {
                clear();
            } else {
                front = (front + 1) % currentCapacity;
                currentCapacity--;
            }
            return firstElement;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return currentCapacity;
    }

    @Override
    public boolean isEmpty() {
        return currentCapacity == 0;
    }

    @Override
    public void clear() {
        front = -1;
        rear = -1;
        currentCapacity = 0;
        elements = new Object[startCapacity];
    }

    @SuppressWarnings({"unchecked"})
    @Override
    public T element() {
        return (T) elements[front];
    }
}
