package ru.mirea.practice.task4;

public class Processor {
    private int generation;
    private int frequency;

    public Processor(int generation, int frequency) {
        this.generation = generation;
        this.frequency = frequency;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Generation - " + getGeneration() + ", Frequency - " + getFrequency();
    }
}
