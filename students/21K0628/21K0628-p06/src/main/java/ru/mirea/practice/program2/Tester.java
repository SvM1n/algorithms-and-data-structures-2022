package ru.mirea.practice.program2;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Planets planet1 = new Planets("Earth");
        Animals animal1 = new Animals("Cat");
        System.out.println(planet1.getName());
        System.out.println(animal1.getName());
    }
}
