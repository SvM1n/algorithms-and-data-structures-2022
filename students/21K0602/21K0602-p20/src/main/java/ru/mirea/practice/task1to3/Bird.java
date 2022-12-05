package ru.mirea.practice.task1to3;

import java.io.Serializable;

public class Bird extends Animal implements Serializable {


    public Bird(int age, String color, String type) {
        super(age, color, type);
    }

    public void walk() {
        System.out.println("walking");
    }

    public void fly() {
        System.out.println("flying");
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString()
                + "}";
    }
}
