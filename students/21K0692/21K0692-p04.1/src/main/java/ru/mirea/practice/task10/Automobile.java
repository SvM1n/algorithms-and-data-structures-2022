package ru.mirea.practice.task10;

public class Automobile extends TransportVehicle {

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return cost * seats;
    }

    public Automobile(double speed, double cost, double seats) {
        super(speed, cost, seats);
    }
}
