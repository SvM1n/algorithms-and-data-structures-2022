package ru.mirea.practice.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    FunctionalChair createFunctionalChair();

    MagicChair createMagicChair();
}
