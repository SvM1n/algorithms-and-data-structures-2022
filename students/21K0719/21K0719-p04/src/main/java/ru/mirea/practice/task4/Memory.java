package ru.mirea.practice.task4;

public class Memory {
    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Capacity - " + getCapacity();
    }
}
