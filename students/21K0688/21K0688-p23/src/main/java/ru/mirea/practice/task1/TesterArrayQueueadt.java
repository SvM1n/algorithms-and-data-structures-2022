package ru.mirea.practice.task1;

public abstract class TesterArrayQueueadt {
    public static void main(String[] args) {
        ArrayQueueadt arrayQueueadt = new ArrayQueueadt(3);
        arrayQueueadt.enqueue(12, arrayQueueadt);
        arrayQueueadt.enqueue(52, arrayQueueadt);
        arrayQueueadt.enqueue(1, arrayQueueadt);

        System.out.println("size = " + arrayQueueadt.size(arrayQueueadt));
        System.out.println("isEmpty: " + arrayQueueadt.isEmpty(arrayQueueadt));
        arrayQueueadt.dequeue(arrayQueueadt);
        arrayQueueadt.clear(arrayQueueadt);
        System.out.println("...clear...");
        System.out.println("size = " + arrayQueueadt.size(arrayQueueadt));
    }
}
