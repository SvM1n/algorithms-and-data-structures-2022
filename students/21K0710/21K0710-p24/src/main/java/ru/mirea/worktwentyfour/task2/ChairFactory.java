package ru.mirea.worktwentyfour.task2;

public final class ChairFactory {
    private ChairFactory() {
    }

    public static VictorianChair createVictorianChair(AbstractChairFactory factory) {
        return factory.createVictorianChair();
    }

    public static VictorianChair createVictorianChair(AbstractChairFactory factory, int a) {
        return factory.createVictorianChair(a);
    }

    public static MagicChair createMagicChair(AbstractChairFactory factory) {
        return factory.createMagicChair();
    }

    public static FunctionalChair createFunctionalChair(AbstractChairFactory factory) {
        return factory.createFunctionalChair();
    }
}
