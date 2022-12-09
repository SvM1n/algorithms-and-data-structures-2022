package ru.mirea.practice.task3;

public class Animal implements Nameable {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
