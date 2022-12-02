package ru.mirea.practice.task10;

public class Plane extends Transport {
    protected double businessCost;

    public Plane(double speed, double seats, double cost, double businessCost) {
        super(speed, seats, cost);
        this.businessCost = businessCost;
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return time * seats * cost + businessCost;
    }

    @Override
    public String toString() {
        return "На самолете: " + this.cost();
    }
}
