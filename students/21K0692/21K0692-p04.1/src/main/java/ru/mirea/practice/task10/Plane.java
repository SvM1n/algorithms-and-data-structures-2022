package ru.mirea.practice.task10;

public class Plane extends TransportVehicle {


    @Override
    public double cost() {
        return cost * seats;
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    public Plane(double speed, double cost, double seats) {
        super(speed, cost, seats);
    }
}
