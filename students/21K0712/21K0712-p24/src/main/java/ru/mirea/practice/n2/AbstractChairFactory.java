package ru.mirea.practice.n2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    ManyFunctionalChair createFunctionalchair();

    MagicChair createMagicChair();
}
