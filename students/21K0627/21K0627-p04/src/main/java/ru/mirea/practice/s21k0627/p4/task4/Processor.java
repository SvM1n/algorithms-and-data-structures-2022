package ru.mirea.practice.s21k0627.p4.task4;

public class Processor {
    int frequency;
    int cores;

    Processor(int frequency, int cores) {
        this.frequency = frequency;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "amount of cores: " + this.cores + ", frequency: " + this.frequency;
    }
}