package ru.mirea.practice.task2.solution2;

public class MagicChairFactory implements ChairFactory {

    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
