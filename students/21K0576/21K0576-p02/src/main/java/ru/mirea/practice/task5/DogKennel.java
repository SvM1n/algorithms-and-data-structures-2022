package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.List;

abstract class DogKennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Prima", 3);
        Dog dog2 = new Dog("Dwayne", 7);
        Dog dog3 = new Dog("Tertia", 1);
        addDog(dog1);
        addDog(dog2);
        addDog(dog3);
        for (Dog i : dogs) {
            System.out.println(i);
            System.out.printf("\"Человеческий\" возраст: %.1f\n", i.getHumanAge());
        }
    }

    public static void addDog(Dog dog) {
        dogs.add(dog);
    }

    static List<Dog> dogs = new ArrayList<>();
}