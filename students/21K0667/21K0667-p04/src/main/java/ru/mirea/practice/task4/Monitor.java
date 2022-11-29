package ru.mirea.practice.task4;

public class Monitor {
    private int refreshRate;
    private String resolution;

    @Override
    public String toString() {
        return "Частота обновления: " + refreshRate
                + ", Разрешение: " + resolution + '\'';
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Monitor(int refreshRate, String resolution) {
        this.refreshRate = refreshRate;
        this.resolution = resolution;
    }
}

