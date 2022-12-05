package ru.mirea.practice.solutiontask10;

public class Cars extends TransportVehicle {

    public Cars() {
        super();
    }

    public Cars(double pricekilometr, double countkilometrs, double averagespeed) {
        super(pricekilometr, countkilometrs, averagespeed);
    }

    @Override
    public double getCost() {
        return pricekilometr * countkilometrs * 0.7;
    }

    @Override
    public String toString() {
        return "Машина со средней скоростью "
                + averagespeed + " км/ч, довезет вас до точки за "
                + String.format("%.2f", getTime()) + " часов за " + getCost() + "р.";
    }
}
