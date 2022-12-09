package ru.mirea.practice.task10;

public class Car extends Vehicle {

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return cost * seats;
    }

    public Car(double speed, double cost, double seats) {
        super(speed, cost, seats);
    }
}