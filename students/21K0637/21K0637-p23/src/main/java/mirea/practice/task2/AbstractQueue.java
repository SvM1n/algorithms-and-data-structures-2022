package mirea.practice.task2;

public abstract class AbstractQueue {
    protected int size;

    public abstract void enqueue(Object element);

    public abstract Object dequeue();

    public abstract Object peek();

    public abstract void push(Object element);

    public abstract Object element();

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }
}
