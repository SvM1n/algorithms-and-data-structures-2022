package ru.mirea.practice.task4;

public class Processor {
    private double frequency;
    private int threads;
    private int cores;

    @Override
    public String toString() {
        return "Частота: " + frequency
                + ", Кол-вл потоков: " + threads
                + ", Кол-во ядер: " + cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public Processor(double frequency, int threads, int cores) {
        this.frequency = frequency;
        this.threads = threads;
        this.cores = cores;
    }
}
