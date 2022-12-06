package ru.mirea.practice.task10;

public class Train extends Vehicle {
    private final double fuelCost;

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return cost * seats + fuelCost;
    }

    public Train(double speed, double cost, double seats, double fuelCost) {
        super(speed, cost, seats);
        this.fuelCost = fuelCost;
    }
}