package ru.mirea.practice.task4;

public class Processor {
    private final int generation;
    private final String serialNumber;
    private final int frequency;

    public Processor(int generation, String serialNumber, int frequency) {
        this.generation = generation;
        this.serialNumber = serialNumber;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" + "generation=" + generation + ", serialNumber='" + serialNumber + '\'' + ", frequency=" + frequency + '}';
    }
}
