package ru.mirea.practice.solutiontask10;

public class Plane extends TransportVehicle {

    public Plane() {
        super();
    }

    public Plane(double pricekilometr, double countkilometrs, double averagespeed) {
        super(pricekilometr, countkilometrs, averagespeed);
    }

    @Override
    public double getCost() {
        return pricekilometr * countkilometrs * 2;
    }

    @Override
    public String toString() {
        return "Самолет со средней скоростью "
                + averagespeed + " км/ч, довезет вас до точки за "
                + String.format("%.2f", getTime()) + " часов за " + getCost() + "р.";
    }
}
