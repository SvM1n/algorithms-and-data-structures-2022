package ru.mirea.practice.task10;

public class Monitor {
    private String resolution;
    private int frequency;

    public Monitor(String resolution, int frequency) {
        this.resolution = resolution;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "resolution='" + resolution + '\''
                + ", frequency=" + frequency
                + '}';
    }
}
