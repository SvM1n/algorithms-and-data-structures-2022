package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing, WomenClothing  {

    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть галстук на мужчину");
    }

}
