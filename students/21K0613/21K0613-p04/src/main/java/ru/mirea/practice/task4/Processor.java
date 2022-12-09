package ru.mirea.practice.task4;

public class Processor {
    private int coreCount;

    private int frequency;
    private double packType;

    public Processor(int coreCount, int frequency, double packType) {
        this.coreCount = coreCount;
        this.packType = packType;
        this.frequency = frequency;
    }


    @Override
    public String toString() {
        return "Processor{"
                +
                "coreCount=" + coreCount
                +
                ", frequency=" + frequency
                +
                ", packType=" + packType
                +
                '}';
    }
}
