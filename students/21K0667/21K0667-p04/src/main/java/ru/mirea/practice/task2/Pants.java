package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing  {

    public Pants(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть штаны на мужчину");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеть штаны на женщину");
    }

}