package ru.mirea.practice.s21k0709.task10;

public class Monitor {
    String resolution;
    int frequency;

    Monitor(String resolution, int frequency) {
        this.resolution = resolution;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Resolution\n" + this.resolution + "\nFrequency: " + this.frequency;
    }

}