package ru.mirea.practice.task4;

public class Memory {
    private final double memoryClock;
    private final String type;
    private final String name;

    public Memory(double memoryClock, String type, String name) {
        this.memoryClock = memoryClock;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Memory: " + name + ", " + type + ", " + memoryClock + "MHz";
    }

}
