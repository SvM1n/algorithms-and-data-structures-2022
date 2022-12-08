package ru.mirea.practice.task3;

public abstract class Test {
    public static void main(String[] args) {
        Person testOne = new Person();
        Person testTwo = new Person("Иван Иванов", 18);
        testOne.move();
        testOne.talk();
        testTwo.move();
        testTwo.talk();

    }
}
