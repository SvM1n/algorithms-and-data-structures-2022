package ru.mirea.practice.task7;

public class Converter {
    private double value;
    private double rate;

    public Converter(double value, double rate) {
        this.rate = rate;
        this.value = value;
    }

    public double getRate() {
        return rate;
    }

    public double getValue() {
        return value;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "The rate of this currency " + rate + ". To pay " + value * rate;
    }
}
