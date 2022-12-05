package ru.mirea.practice2.task5;

import java.util.ArrayList;
import java.util.List;

abstract class DogTester {
    public static void addDog(Dog dog, List<Dog> list) {
        list.add(dog);
    }

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        Dog dog1 = new Dog("Martin", 12);
        Dog dog2 = new Dog();
        System.out.println(dog1.countHumanAge(dog1.getDogAge()));
        addDog(dog1, list);
        addDog(dog2, list);
        dog1.setDogAge(5);
        dog2.setDogName("Martin");
        dog1.getDogName();
        System.out.println(list);
    }
}
