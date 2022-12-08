package ru.mirea.practice.task11;

public class Fahrenheit implements Convertable {

    @Override
    public double convert(double degreeC) {
        return 1.8 * degreeC + 32;
    }
}
