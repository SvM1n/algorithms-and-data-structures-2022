package ru.mirea.worktwentyfour.task2;

public class ChairFactory implements AbstractChairFactory {
    private int age;

    ChairFactory(int age) {
        this.age = age;
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalchair() {
        return new FunctionalChair();
    }
}
