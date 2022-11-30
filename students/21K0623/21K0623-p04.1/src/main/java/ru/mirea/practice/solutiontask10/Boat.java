package ru.mirea.practice.solutiontask10;

public class Boat extends TransportVehicle {

    public Boat() {
        super();
    }

    public Boat(double pricekilometr, double countkilometrs, double averagespeed) {
        super(pricekilometr, countkilometrs, averagespeed);
    }

    @Override
    public double getCost() {
        return pricekilometr * countkilometrs * 1.5;
    }

    @Override
    public String toString() {
        return "Корабль со средней скоростью "
                + averagespeed + " км/ч, довезет вас до точки за "
                + String.format("%.2f", getTime()) + " часов за " + getCost() + "р.";
    }
}
