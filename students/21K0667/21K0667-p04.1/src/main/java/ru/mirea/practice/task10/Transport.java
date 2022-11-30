package ru.mirea.practice.task10;

public abstract class Transport {
    protected double speed;
    protected double seats;

    public Transport(double speed, double seats) {
        this.speed = speed;
        this.seats = seats;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSeats() {
        return seats;
    }

    public void setSeats(double seats) {
        this.seats = seats;
    }

    public abstract double time(double distance);

    public abstract double cost(double time);
}
