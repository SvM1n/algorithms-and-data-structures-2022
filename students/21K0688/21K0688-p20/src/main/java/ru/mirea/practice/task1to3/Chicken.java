package ru.mirea.practice.task1to3;

public class Chicken extends Animal {

    public Chicken(String type, String name) {
        super(type, name);
    }

    @Override
    public void sound() {
        System.out.print("Ko Ko Ko!!!");
    }
}
