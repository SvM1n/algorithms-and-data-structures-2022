package ru.mirea.practice.s21k0709.task3;

public class Elephant implements Nameable {
    private String name;
    private double mass;
    private String male;

    public Elephant(String name, double mass, String male) {
        this.name = name;
        this.mass = mass;
        this.male = male;
    }

    public Elephant() {
        //
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Elephant{"
                +
                "name='" + name + '\''
                +
                ", mass=" + mass
                +
                ", male='" + male + '\''
                +
                '}';
    }
}
