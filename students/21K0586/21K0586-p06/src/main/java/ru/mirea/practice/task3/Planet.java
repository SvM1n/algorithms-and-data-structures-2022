package ru.mirea.practice.task3;

public class Planet implements Nameable {
    private String name;
    private Double radius;

    public Planet(String name, Double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{"
            + "name='" + name + '\''
            + ", radius=" + radius
            + '}';
    }
}
