package ru.mirea.practice.s21k0709.task1;

public abstract class Tester {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> queueModule = new ArrayQueueModule<>(4);
        queueModule.enqueue(6);
        System.out.println(queueModule.element());
        System.out.println(queueModule.dequeue());
        System.out.println(queueModule.size());
        queueModule.clear();
        System.out.println(queueModule.size());
        queueModule.enqueue(4);
        queueModule.enqueue(3);
        queueModule.enqueue(2);
        queueModule.enqueue(9);
        queueModule.display();
    }
}

