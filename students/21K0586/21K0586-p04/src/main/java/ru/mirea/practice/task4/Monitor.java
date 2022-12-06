package ru.mirea.practice.task4;

public class Monitor {
    private final String permission;
    private final int frequency;

    public Monitor(String permission, int frequency) {
        this.permission = permission;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{" + "permission='" + permission + '\'' + ", frequency=" + frequency + '}';
    }
}
