package ru.mirea.practice.task2.solution1;

import ru.mirea.practice.task2.solution2.Chair;
import ru.mirea.practice.task2.solution2.MagicChair;
import ru.mirea.practice.task2.solution2.VictorianChair;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public Chair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public Chair createFunctionalChair() {
        return new MagicChair();
    }
}
