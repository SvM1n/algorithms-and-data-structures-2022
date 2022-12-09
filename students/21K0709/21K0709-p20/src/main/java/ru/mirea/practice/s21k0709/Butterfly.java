package ru.mirea.practice.s21k0709;

import java.io.Serializable;

public class Butterfly extends Animal implements Serializable {
    public Butterfly(int age, String gender, String color) {
        super(age, gender, color);
    }

    public void fly() {
        System.out.println("Лететь!");
    }

    @Override
    public String toString() {
        return "Butterfly{"
                +
                super.toString()
                +
                "}";
    }
}
