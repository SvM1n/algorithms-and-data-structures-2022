package ru.mirea.practice.task4;

public class Processor {
    private int year;
    private int frequency;

    public Processor(int year, int frequency) {
        this.year = year;
        this.frequency = frequency;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Generation - " + getYear() + ", Frequency - " + getFrequency();
    }
}
