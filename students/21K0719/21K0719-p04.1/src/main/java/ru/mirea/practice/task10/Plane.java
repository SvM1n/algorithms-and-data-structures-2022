package ru.mirea.practice.task10;

public class Plane extends Vehicle {
    private final double businessCost;

    @Override
    public double cost() {
        return cost * seats * businessCost;
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    public Plane(double speed, double cost, double seats, double businessCost) {
        super(speed, cost, seats);
        this.businessCost = businessCost;
    }
}
