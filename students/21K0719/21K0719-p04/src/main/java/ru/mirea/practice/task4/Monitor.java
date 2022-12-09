package ru.mirea.practice.task4;

public class Monitor {
    private String resolution;
    private int frequency;

    public Monitor(String resolution, int frequency) {
        this.resolution = resolution;
        this.frequency = frequency;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Permission - " + getResolution() + ", Frequency - " + getFrequency();
    }
}
