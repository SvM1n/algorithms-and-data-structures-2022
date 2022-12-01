package ru.mirea.practice.task4;

public class Monitor {
    private final String permission;
    private final int frequency;
    private final String name;

    public Monitor(String name, String permission, int frequency) {
        this.frequency = frequency;
        this.permission = permission;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor: " + name + ", " + permission + ", " + frequency + "Hz";
    }

}
