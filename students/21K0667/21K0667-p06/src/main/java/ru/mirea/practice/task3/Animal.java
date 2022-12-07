package ru.mirea.practice.task3;

public class Animal implements Nameable {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

}
