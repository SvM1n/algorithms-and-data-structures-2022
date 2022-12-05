package ru.mirea.practice.task5.s21k0709;

import java.util.ArrayList;
import java.util.List;

public class DogsHouse {
    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog obj) {
        dogs.add(obj);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public String toString() {
        return "Массив собак:" + dogs;
    }
}
