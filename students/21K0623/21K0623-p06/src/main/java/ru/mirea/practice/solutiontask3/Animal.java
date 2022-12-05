package ru.mirea.practice.solutiontask3;

public class Animal implements Nameable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return name;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
