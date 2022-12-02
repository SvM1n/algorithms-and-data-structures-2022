package ru.mirea.practice.task2.solution1;

import ru.mirea.practice.task2.solution2.Chair;

public interface AbstractChairFactory {

    Chair createMagicChair();

    Chair createVictorianChair(int age);

    Chair createFunctionalChair();
}
