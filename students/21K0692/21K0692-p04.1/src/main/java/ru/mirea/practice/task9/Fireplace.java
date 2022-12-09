package ru.mirea.practice.task9;

public class Fireplace extends Furniture {
    private final int maxTemperature;

    public Fireplace(int cost, int weight, int maxTemperature) {
        super(cost, weight);
        this.maxTemperature = maxTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    @Override
    public String toString() {
        return "Fireplace{"
                + "maxTemperature=" + maxTemperature
                + '}';
    }
}
