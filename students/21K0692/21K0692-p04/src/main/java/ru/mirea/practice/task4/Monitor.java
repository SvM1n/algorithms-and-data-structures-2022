package ru.mirea.practice.task4;

public class Monitor {
    private String permission;
    private int frequency;

    public Monitor(String permission, int frequency) {
        this.permission = permission;
        this.frequency = frequency;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Permission - " + getPermission() + ", Frequency - " + getFrequency();
    }
}
