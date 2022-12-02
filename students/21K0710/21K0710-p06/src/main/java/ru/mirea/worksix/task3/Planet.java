package ru.mirea.worksix.task3;

public class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" + "name='" + name + '\'' + '}';
    }

    @Override
    public String getName() {
        return this.name;
    }
}
