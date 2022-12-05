package ru.mirea.practice.task2.solution2;

public abstract class Main {
    public static void main(String[] args) {
        ChairFactory factory = new VictorianChairFactory(143);
        Chair chair = factory.createChair();
        System.out.println(chair.toString());
        factory = new FunctionalChairFactory();
        chair = factory.createChair();
        System.out.println(chair.toString());
        factory = new MagicChairFactory();
        chair = factory.createChair();
        System.out.println(chair.toString());


    }
}
