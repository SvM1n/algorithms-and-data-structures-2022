package ru.mirea.practice.task10;

public abstract class Transport {
    protected double speed;
    protected double seats;
    protected double time;

    protected double cost;

    public Transport(double speed, double seats, double cost) {
        this.speed = speed;
        this.seats = seats;
        this.cost = cost;
    }

    public abstract double time(double distance);

    public abstract double cost();

    public abstract String toString();
}
