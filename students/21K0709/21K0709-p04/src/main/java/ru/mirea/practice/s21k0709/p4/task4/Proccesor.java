package ru.mirea.practice.s21k0709.p4.task4;

public class Proccesor {
    int numberOfCores;
    int tact;
    int heatDissipation;

    Proccesor(int numberOfCores, int tact, int heatDissipation) {
        this.heatDissipation = heatDissipation;
        this.tact = tact;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Number of cores \n" + this.numberOfCores + "Tact Frequency \n" + this.tact + " \n" + "Heat Dissipation \n" + this.heatDissipation;
    }

}