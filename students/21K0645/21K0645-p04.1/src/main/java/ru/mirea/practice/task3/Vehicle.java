package ru.mirea.practice.task3;

/* Создать абстрактный класс, описывающий Транспортное средство и
подклассы Автомобиль, Самолет, Поезд, Корабль. Подсчитать время и
стоимость перевозки пассажиров и грузов каждым транспортным средством */

public abstract class Vehicle {

    protected double speed;
    protected double cost;
    protected int seats;

    public Vehicle(double speed, double cost, int seats) {
        this.speed = speed;
        this.cost = cost;
        this.seats = seats;
    }

    public double getSeats() {
        return seats;
    }

    public double shippingTime(double shippingLengths) {
        return shippingLengths / speed;
    }

    public double shippingCost(double shippingLengths) {
        return shippingLengths / speed * cost;
    }

}
