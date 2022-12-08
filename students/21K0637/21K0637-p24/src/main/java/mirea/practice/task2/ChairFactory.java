package mirea.practice.task2;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public Chair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public Chair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public Chair createFunctionalChair() {
        return new MultifunctionalChair();
    }
}
