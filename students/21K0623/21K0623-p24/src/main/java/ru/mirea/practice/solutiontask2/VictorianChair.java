package ru.mirea.practice.solutiontask2;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Victorian сhair, age = " + age;
    }
}
