package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    private List<Dog> kennel;

    public void setKennel() {
        kennel = new ArrayList<Dog>();
    }

    public void addDog(Dog dog) {
        kennel.add(dog);
    }

    public void print() {
        System.out.print(kennel.toString());
    }
}


