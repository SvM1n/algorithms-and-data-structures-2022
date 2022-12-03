package ru.mirea.practice.task3;

public class Person implements Nameable {
    public String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
