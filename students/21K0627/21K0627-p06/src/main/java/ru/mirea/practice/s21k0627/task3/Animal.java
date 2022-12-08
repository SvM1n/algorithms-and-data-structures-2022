package ru.mirea.practice.s21k0627.task3;

public class Animal implements Nameable {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{"
                + "name='" + name
                + ", species='" + species + '}';
    }
}
