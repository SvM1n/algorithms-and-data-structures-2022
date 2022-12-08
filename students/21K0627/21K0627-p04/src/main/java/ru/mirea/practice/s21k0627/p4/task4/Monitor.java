package ru.mirea.practice.s21k0627.p4.task4;

public class Monitor {
    float diagonal;

    Monitor(float diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "diagonal: " + this.diagonal;
    }

}
