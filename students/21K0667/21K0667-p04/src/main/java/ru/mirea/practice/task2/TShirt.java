package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing  {

    public TShirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть футболку на мужчину");
    }
}
