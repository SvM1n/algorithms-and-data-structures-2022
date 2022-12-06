package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Meat test1 = new Meat("Chicken", 200);
        System.out.println(test1.getPrice());
        Phone test2 = new Phone(10000, "Mi A1");
        System.out.println(test2.getPrice());
    }

}
