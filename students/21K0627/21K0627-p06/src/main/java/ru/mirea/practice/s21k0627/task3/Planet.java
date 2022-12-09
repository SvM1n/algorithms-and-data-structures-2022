package ru.mirea.practice.s21k0627.task3;

public class Planet implements Nameable {
    private String name;
    private int mass;

    public Planet(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{"
                + "name='" + name
                + ", mass=" + mass + '}';
    }
}
