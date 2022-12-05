package ru.mirea.practice.s21k0709.p401.task10;

public class Train extends Vehicle {
    protected double averageSpeed;

    public Train(double priceKilometer, double multiplierPerKm, double averageSpeed) {
        super(priceKilometer, multiplierPerKm);
        this.averageSpeed = averageSpeed;
    }


    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    double getTime(double distance) {
        return distance / this.averageSpeed;
    }

    @Override
    double getPassengerPrice(double distance) {
        return this.priceKilometer * distance;
    }

    @Override
    double getCargoPrice(double distance, double cargoWeight) {
        return this.priceKilometer * this.multiplierPerKm * cargoWeight * distance;
    }

    @Override
    public String toString() {
        return "Train{"
                +
                "averageSpeed=" + averageSpeed
                +
                ", priceKilometer=" + priceKilometer
                +
                ", multiplierPerKm=" + multiplierPerKm
                +
                '}';
    }
}
