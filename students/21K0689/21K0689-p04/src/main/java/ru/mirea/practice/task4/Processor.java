package ru.mirea.practice.task4;

public class Processor {
    private double frequency;
    private String model;
    private final String developer;

    public Processor(double frequency, String name, String developer) {
        this.frequency = frequency;
        this.model = name;
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Processor: " + developer + model + ", frequency: " + frequency + "GHz";
    }
}
