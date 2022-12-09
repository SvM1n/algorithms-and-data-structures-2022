package ru.mirea.practice.s21k0627.p4.task4;

public abstract class Test {
    public static void main(String[] args) {
        Computer computertest = new Computer(85000, Brand.Apple,
                new Processor(3200, 8),
                new Monitor(13.3f),
                new Memory(8192, 3733));
        System.out.println(computertest);
    }
}
