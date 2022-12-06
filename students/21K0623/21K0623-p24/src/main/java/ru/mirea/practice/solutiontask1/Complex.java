package ru.mirea.practice.solutiontask1;

public class Complex {
    private double real;
    private double i;

    Complex(double real, double i) {
        this.real = real;
        this.i = i;
    }

    Complex() {
        real = 0;
        i = 0;
    }

    public double getReal() {

        return real;
    }

    public double getI() {

        return i;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setI(double i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return real + " " + i;
    }
}
