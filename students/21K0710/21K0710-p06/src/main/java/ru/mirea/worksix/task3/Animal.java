package ru.mirea.worksix.task3;

public class Animal implements Nameable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + '}';
    }

    @Override
    public String getName() {
        return this.name;
    }
}
