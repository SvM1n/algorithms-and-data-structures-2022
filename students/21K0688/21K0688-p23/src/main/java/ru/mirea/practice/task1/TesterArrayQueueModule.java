package ru.mirea.practice.task1;

public abstract class TesterArrayQueueModule {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(5);
        ArrayQueueModule.enqueue(2);

        System.out.println("size = " + ArrayQueueModule.size());
        System.out.println("isEmpty: " + ArrayQueueModule.isEmpty());
        ArrayQueueModule.dequeue();
        ArrayQueueModule.clear();
        System.out.println("...clear...");
        System.out.println("size = " + ArrayQueueModule.size());
    }
}
