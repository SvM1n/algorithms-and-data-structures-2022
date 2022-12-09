package ru.mirea.practice.task4;

public class Monitor {
    private int diagonal;
    private int frequency;

    public Monitor(int diagonal, int frequency) {
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" + "diagonal=" + diagonal + ", frequency=" + frequency + '}';
    }
}
