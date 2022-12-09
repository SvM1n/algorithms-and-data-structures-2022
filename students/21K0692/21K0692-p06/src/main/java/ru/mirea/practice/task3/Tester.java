package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Human human = new Human("Арсюша Худякоу");
        Planet planet = new Planet("Марс");
        System.out.println(human.getName());
        System.out.print(planet.getName());
    }


}
