package ru.mirea.practice.task10;

public class Ship extends Transport {
    public Ship(double speed, double seats) {
        super(speed, seats);
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double time) {
        return time * seats * 125;
    }
}
