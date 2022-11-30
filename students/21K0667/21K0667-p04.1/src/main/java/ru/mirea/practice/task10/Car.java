package ru.mirea.practice.task10;

public class Car extends Transport {

    public Car(double speed, double seats) {
        super(speed, seats);
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost(double time) {
        return time * 50 * seats;
    }
}
