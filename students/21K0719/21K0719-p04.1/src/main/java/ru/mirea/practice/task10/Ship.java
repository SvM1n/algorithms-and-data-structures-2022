package ru.mirea.practice.task10;

public class Ship extends Vehicle {
    private final double taxes;

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return cost * seats + taxes;
    }

    public Ship(double speed, double cost, double seats, double taxes) {
        super(speed, cost, seats);
        this.taxes = taxes;
    }
}