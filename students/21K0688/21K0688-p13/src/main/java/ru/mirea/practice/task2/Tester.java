package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Person person = new Person("Арсюша", "Худякоу");
        System.out.print(person.returnFio());
    }
}
