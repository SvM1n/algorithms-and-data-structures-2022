package mirea.practice.task2;

public interface AbstractChairFactory {
    Chair createVictorianChair(int age);

    Chair createMagicanChair();

    Chair createFunctionalChair();
}
