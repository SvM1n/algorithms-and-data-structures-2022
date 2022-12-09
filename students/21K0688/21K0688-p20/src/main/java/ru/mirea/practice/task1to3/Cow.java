package ru.mirea.practice.task1to3;

public class Cow extends Animal {

    public Cow(String type, String name) {
        super(type, name);
    }

    @Override
    public void sound() {
        System.out.print("Moo!!!");
    }
}
