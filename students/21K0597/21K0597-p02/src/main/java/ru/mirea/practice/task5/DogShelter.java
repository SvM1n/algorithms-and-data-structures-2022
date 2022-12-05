package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.List;

public class DogShelter {

    private final List<Dog> shelter;

    public DogShelter() {
        shelter = new ArrayList<Dog>();
    }

    public void addDog(Dog dog) {
        shelter.add(dog);
    }

    public Dog get(int i) {
        return shelter.get(i);
    }

    public void show() {
        for (int i = 0; i < shelter.size(); i++) {
            System.out.println(i + " " + shelter.get(i).toString());
        }
    }
}
