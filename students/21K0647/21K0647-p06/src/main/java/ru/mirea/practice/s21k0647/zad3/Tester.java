package ru.mirea.practice.s21k0647.zad3;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Auto auto = new Auto();
        Planet planet = new Planet();
        System.out.println(animal.getName());
        System.out.println(auto.getName());
        System.out.println(planet.getName());
    }
}
