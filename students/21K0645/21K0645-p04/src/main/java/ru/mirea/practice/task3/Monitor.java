package ru.mirea.practice.task3;

public class Monitor {
    private final double screenArea;

    public Monitor(double screenArea) {
        this.screenArea = screenArea;
    }

    public double getScreenArea() {
        return screenArea;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "screenArea=" + screenArea
                + '}';
    }
}
