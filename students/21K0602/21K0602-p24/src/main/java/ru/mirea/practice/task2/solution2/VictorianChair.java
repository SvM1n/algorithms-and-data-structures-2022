package ru.mirea.practice.task2.solution2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {

        this.age = age;
    }

    @Override
    public boolean hasLegs() {
        return true;
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
        return "VictorianChair{" + "age=" + age + '}';
    }
}
