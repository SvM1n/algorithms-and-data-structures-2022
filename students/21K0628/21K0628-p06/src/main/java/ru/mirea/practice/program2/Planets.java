package ru.mirea.practice.program2;

public class Planets implements Nameable {
    private String planet;

    public Planets(String planet) {
        this.planet = planet;
    }

    @Override
    public String getName() {
        return planet;
    }
}
