package ru.mirea.practice.task2.solution2;

public class VictorianChairFactory implements ChairFactory {
    private int age;

    public VictorianChairFactory(int age) {
        this.age = age;
    }

    @Override
    public Chair createChair() {
        return new VictorianChair(age);
    }


}
