package ru.mirea.practice.task11;

public class Kelvin implements Convertable {
    @Override
    public double convert(double degreeC) {
        return degreeC + 273;
    }
}
