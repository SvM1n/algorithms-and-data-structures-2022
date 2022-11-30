package ru.mirea.practice.task10;

public class Plane extends Transport {
    public Plane(double speed, double seats) {
        super(speed, seats);
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double time) {
        return time * seats * 200;
    }
}
