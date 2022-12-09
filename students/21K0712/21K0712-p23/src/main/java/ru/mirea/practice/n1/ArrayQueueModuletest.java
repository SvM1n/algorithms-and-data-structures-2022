package ru.mirea.practice.n1;

abstract class ArrayQueueModuletest {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.dequeue();
        for (int i = 1; i <= 3; i++) {
            q.enqueue(i);
        }
        ArrayQueueModule element = new ArrayQueueModule(q, 1);
        System.out.println(element.getElement());
    }
}
