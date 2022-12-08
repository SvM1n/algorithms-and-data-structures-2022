package ru.mirea.practice.task2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean sitOn() {
        return false;
    }
}
