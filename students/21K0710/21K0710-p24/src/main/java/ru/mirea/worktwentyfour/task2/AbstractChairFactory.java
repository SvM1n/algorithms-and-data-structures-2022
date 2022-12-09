package ru.mirea.worktwentyfour.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    VictorianChair createVictorianChair(int a);

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
