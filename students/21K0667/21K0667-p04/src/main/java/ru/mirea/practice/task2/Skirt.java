package ru.mirea.practice.task2;

public class Skirt extends Clothes implements MenClothing, WomenClothing  {

    public Skirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеть юбку на женщину");
    }

}