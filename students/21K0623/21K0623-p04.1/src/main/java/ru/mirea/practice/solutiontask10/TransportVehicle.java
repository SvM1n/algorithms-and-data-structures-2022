package ru.mirea.practice.solutiontask10;

public abstract class TransportVehicle {
    protected double pricekilometr;
    protected double averagespeed;
    protected double countkilometrs;

    public TransportVehicle() {
        pricekilometr = 0;
        averagespeed = 0;
        countkilometrs = 0;
    }

    public TransportVehicle(double pricekilometr, double countkilometrs, double averagespeed) {
        this.pricekilometr = pricekilometr;
        this.averagespeed = averagespeed;
        this.countkilometrs = countkilometrs;
    }


    public void setPricekilometr(double pricekilometr) {
        this.pricekilometr = pricekilometr;
    }

    public void setAveragespeed(double averagespeed) {
        this.averagespeed = averagespeed;
    }

    public double getPricekilometr() {
        return pricekilometr;
    }

    public double getAveragespeed() {
        return averagespeed;
    }

    public double getTime() {
        return countkilometrs / averagespeed;
    }

    public abstract double getCost();

    @Override
    public abstract String toString();
}
