package ru.mirea.practice.solutiontask2;

public interface AbstractChairFactory {

    Chair createMagicChair();

    Chair createVictorianChair(int age);

    Chair createFunctionalChair();
}
