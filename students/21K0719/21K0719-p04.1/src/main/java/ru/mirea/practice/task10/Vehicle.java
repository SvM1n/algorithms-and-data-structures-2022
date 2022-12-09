package ru.mirea.practice.task10;

public abstract class Vehicle {
    protected double speed;
    protected double cost;
    protected double seats;

    public abstract double time(double distance);

    public abstract double cost();

    public Vehicle(double speed, double cost, double seats) {
        this.speed = speed;
        this.cost = cost;
        this.seats = seats;
    }
}