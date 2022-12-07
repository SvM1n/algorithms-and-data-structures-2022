package ru.mirea.practice.program2;

public class Animals implements Nameable {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
