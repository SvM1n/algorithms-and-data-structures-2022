package ru.mirea.worksix.task3;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Car car = new Car("Renault Logan");
        Nameable nameable = car;
        System.out.println(nameable.getName());
        Animal animal = new Animal("Bear");
        nameable = animal;
        System.out.println(nameable.getName());
        Planet planet = new Planet("Neptune");
        nameable = planet;
        System.out.println(nameable.getName());
    }
}
