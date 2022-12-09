package ru.mirea.practice.task4;

public class Memory {
    private int capacity;
    private double timing;
    private String type;

    public Memory(int capacity, double timing, String type) {
        this.capacity = capacity;
        this.timing = timing;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory{"
                +
                "capacity=" + capacity
                +
                ", timing=" + timing
                +
                ", type='" + type + '\''
                +
                '}';
    }
}
