package ru.mirea.practice.task10;

public class Train extends Transport {
    protected double coupeCost;

    public Train(double speed, double seats, double cost, double coupeCost) {
        super(speed, seats, cost);
        this.coupeCost = coupeCost;
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return time * seats * cost + coupeCost;
    }

    @Override
    public String toString() {
        return "На поезде: " + this.cost();
    }
}
