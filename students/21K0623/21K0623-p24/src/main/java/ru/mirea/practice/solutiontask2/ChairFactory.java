package ru.mirea.practice.solutiontask2;

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
