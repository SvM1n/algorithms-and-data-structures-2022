package ru.mirea.practice.task3;

public class Human implements Nameable {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

}
