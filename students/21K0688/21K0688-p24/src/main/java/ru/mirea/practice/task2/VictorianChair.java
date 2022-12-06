package ru.mirea.practice.task2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean sitOn() {
        return true;
    }
}
