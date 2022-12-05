package ru.mirea.practice.s21k0709.p401.task10;

public abstract class Vehicle {
    protected double priceKilometer;
    protected double multiplierPerKm;

    public Vehicle() {
        // constructor
    }

    public Vehicle(double priceKilometer, double multiplierPerKm) {
        this.priceKilometer = priceKilometer;
        this.multiplierPerKm = multiplierPerKm;
    }



    abstract double getTime(double distance);

    abstract double getPassengerPrice(double distance);

    abstract double getCargoPrice(double distance, double cargoWeight);

    @Override
    public String toString() {
        return "Vehicle{" + "pricePerKilometer=" + priceKilometer + ", multiplierPerKilogram=" + multiplierPerKm + '}';
    }

}
