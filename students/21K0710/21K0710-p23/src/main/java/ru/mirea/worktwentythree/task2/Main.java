package ru.mirea.worktwentythree.task2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.dequeue();
        for (int i = 1; i < 6; i++) {
            q.enqueue(i);
        }
        q.enqueue(6);
        q.display();
        q.dequeue();
        q.display();
    }
}
