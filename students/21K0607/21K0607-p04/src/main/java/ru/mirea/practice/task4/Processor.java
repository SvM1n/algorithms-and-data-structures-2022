package ru.mirea.practice.task4;

public class Processor {
    private int frequency;
    private int generation;

    public Processor(int generation, int frequency) {
        this.frequency = frequency;
        this.generation = generation;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getGeneration() {
        return generation;
    }

    @Override
    public String toString() {
        return "Processor: generation " + generation + " frequency " + frequency;
    }
}
