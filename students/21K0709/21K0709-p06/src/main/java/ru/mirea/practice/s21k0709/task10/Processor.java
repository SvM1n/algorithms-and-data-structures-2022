package ru.mirea.practice.s21k0709.task10;

public class Processor {
    int numberOfCores;
    double freqTact;


    Processor(int numberOfCores, double freqTact) {
        this.freqTact = freqTact;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Number of cores \n" + this.numberOfCores + "Tact Frequency \n" + this.freqTact + " \n";
    }

}