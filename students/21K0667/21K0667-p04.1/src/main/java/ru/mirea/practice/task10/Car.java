package ru.mirea.practice.task10;

public class Car extends Transport {

    public Car(double speed, double seats, double cost) {
        super(speed, seats, cost);
    }

    @Override
    public double time(double distance) {
        return distance / speed;
    }

    @Override
    public double cost() {
        return time * cost * seats;
    }

    @Override
    public String toString() {
        return "На машине: " + this.cost();
    }
}
