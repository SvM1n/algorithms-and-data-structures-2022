package ru.mirea.practice.task1;

public abstract class ArrayQueueTester {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);

        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(2);

        System.out.println("size = " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.clear();
        System.out.println("...clear...");
        System.out.println("size = " + queue.size());
    }
}
