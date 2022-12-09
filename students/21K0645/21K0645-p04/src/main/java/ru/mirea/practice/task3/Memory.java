package ru.mirea.practice.task3;

public class Memory {
    private final int storage;

    public Memory(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Memory{"
                + "storage=" + storage
                + '}';
    }
}
