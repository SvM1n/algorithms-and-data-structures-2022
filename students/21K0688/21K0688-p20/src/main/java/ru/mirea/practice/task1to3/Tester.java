package ru.mirea.practice.task1to3;

public abstract class Tester {
    public static void main(String[] args) {
        GenericBox<String, Animal, Integer> genericBox = new GenericBox<>("Hello Арсюша Худякоу!!!",
                new Chicken("Chicken", "Арсюша Худякоу"),
                5);

        genericBox.names();
        System.out.println("\n" + genericBox);
    }
}
