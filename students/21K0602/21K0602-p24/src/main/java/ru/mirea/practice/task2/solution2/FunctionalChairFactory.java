package ru.mirea.practice.task2.solution2;

public class FunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new FunctionalChair();
    }

}
