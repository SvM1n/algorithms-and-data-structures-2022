package ru.mirea.practice.task2.solution2;

public class FunctionalChair implements Chair {

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }

    @Override
    public String toString() {
        return "FunctionalChair";
    }
}
