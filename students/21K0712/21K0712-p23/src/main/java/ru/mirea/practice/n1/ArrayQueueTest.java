package ru.mirea.practice.n1;

abstract class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue a = new ArrayQueue();
        a.dequeue();
        for (int i = 1; i <= 3; i++) {
            a.enqueue(i);
        }
        a.enqueue(3);
        a.display();
        a.dequeue();
        a.display();
        a.element();
        a.size();
        a.clear();
    }
}
