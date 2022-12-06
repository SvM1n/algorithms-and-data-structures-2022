package ru.mirea.practice.solutiontask2;

public class FunctionalChair implements Chair {

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    @Override
    public String toString() {
        return "Functional сhair";
    }
}
