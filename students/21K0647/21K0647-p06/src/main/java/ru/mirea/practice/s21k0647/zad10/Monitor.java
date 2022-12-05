package ru.mirea.practice.s21k0647.zad10;

public class Monitor {
    float diagonal;
    int brightness;
    int frequency;

    Monitor(float diagonal, int brightness, int frequency) {
        this.brightness = brightness;
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Diagonal " + diagonal + "\nBrightness " + brightness + "\nFrequency " + this.frequency;
    }

}
