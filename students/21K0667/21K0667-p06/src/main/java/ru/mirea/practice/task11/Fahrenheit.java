package ru.mirea.practice.task11;

public class Fahrenheit implements Convertable {

    @Override
    public double convert(double degrees) {
        return 32 + 1.8 * degrees;
    }
}