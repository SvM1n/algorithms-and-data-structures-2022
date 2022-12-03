package ru.mirea.practice.task10;

public class Memory {
    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory{"
                + "capacity=" + capacity
                + '}';
    }
}
