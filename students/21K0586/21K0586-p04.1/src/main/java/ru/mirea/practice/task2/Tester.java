package ru.mirea.practice.task2;


public abstract class Tester {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone = new Phone(123, "model 1");
        phone = new Phone(123, 80, "model 1");
        phone.receiveCall("Alex", 456);
    }
}
