package ru.mirea.practice.s21k0709.p4.task4;

public class Monitor {
    float diagonal;
    int frequency;

    Monitor(float diagonal, int frequency) {
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Diagonal\n" + this.diagonal + "\nFrequency: " + this.frequency;
    }

}