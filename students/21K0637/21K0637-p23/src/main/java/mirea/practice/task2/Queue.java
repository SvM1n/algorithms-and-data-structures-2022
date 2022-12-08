package mirea.practice.task2;

public interface Queue {
    void enqueue(Object element);

    Object dequeue();

    Object peek();

    void push(Object element);

    Object element();

    int size();

    Boolean isEmpty();

    void clear();


}
