package ru.mirea.practice.task1;

public abstract class Main {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> queueModule = new ArrayQueueModule<>(5);
        queueModule.enqueue(6);
        queueModule.enqueue(4);
        System.out.println(queueModule.element());
        System.out.println(queueModule.dequeue());
        System.out.println(queueModule.size());
        queueModule.clear();
        System.out.println(queueModule.size());
        queueModule.enqueue(4);
        queueModule.enqueue(3);
        queueModule.enqueue(2);
        queueModule.enqueue(9);
        queueModule.enqueue(7);
        queueModule.display();
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(5);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.enqueue(5);
    }
}
