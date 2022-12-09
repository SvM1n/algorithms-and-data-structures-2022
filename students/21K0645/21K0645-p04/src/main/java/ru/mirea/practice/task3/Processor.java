package ru.mirea.practice.task3;

public class Processor {
    private final double frequency;
    private final int numberOfCores;

    public Processor(double frequency, int numberOfCores) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "frequency=" + frequency
                + ",  numberOfCores=" + numberOfCores
                + '}';
    }
}
