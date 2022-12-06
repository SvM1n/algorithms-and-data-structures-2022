package ru.mirea.practice.task3;

public abstract class Vehicle {

    protected double speed;
    protected double cost;
    protected int seats;

    public Vehicle(double speed, double cost, int seats) {
        this.speed = speed;
        this.cost = cost;
        this.seats = seats;
    }

    public double getSeats(){
        return seats;
    }

    public double shippingTime(double shippingLengths){
        return shippingLengths / speed;
    }

    public double shippingCost(double shippingLengths){
        return shippingLengths / speed * cost;
    }

}
