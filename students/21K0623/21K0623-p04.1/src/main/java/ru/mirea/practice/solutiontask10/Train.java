package ru.mirea.practice.solutiontask10;

public class Train extends TransportVehicle {

    public Train() {
        super();
    }

    public Train(double pricekilometr, double countkilometrs, double averagespeed) {
        super(pricekilometr, countkilometrs, averagespeed);
    }

    @Override
    public double getCost() {
        return pricekilometr * countkilometrs * 0.5;
    }

    @Override
    public String toString() {
        return "Поезд со средней скоростью "
                + averagespeed + " км/ч, довезет вас до точки за "
                + String.format("%.2f", getTime()) + " часов за " + getCost() + "р.";
    }
}
