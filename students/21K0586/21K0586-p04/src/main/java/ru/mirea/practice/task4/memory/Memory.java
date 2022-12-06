package ru.mirea.practice.task4.memory;

public class Memory {
    private final int volume;
    private final Type type;

    public Memory(int volume, Type type) {
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "memory {" + "volume=" + volume + ", type=" + type + '}';
    }
}
