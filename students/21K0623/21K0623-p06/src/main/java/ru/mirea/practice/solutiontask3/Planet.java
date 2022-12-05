package ru.mirea.practice.solutiontask3;

public class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return name;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
