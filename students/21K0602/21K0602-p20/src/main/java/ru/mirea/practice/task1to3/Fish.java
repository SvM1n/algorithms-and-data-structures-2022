package ru.mirea.practice.task1to3;

import java.io.Serializable;

public class Fish extends Animal implements Serializable {

    public Fish(int age, String color, String type) {
        super(age, color, type);
    }

    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + "}";
    }
}
