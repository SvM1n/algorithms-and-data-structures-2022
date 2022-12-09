package ru.mirea.practice.task10;

public class Ship extends Transport {
    protected double cargoCost;

    public Ship(double speed, double seats, double cost, double cargoCost) {
        super(speed, seats, cost);
        this.cargoCost = cargoCost;
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return time * seats * cost + cargoCost;
    }

    @Override
    public String toString() {
        return "На корабле: " + this.cost();
    }
}
