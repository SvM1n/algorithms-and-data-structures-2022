package ru.mirea.practice.task10;

public class Processor {
    private double frequency;

    public Processor(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "frequency=" + frequency
                + '}';
    }
}
