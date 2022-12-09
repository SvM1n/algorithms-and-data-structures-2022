package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Sizes size, int cost, String color) {
        clothesColor = color;
        clothesCost = cost;
        clothesSize = size;
    }

    @Override
    public void dressMan() {
        System.out.println(clothesColor + clothesCost + clothesSize);
    }


    @Override
    public void dressWoman() {
        System.out.println(clothesColor + clothesCost + clothesSize);

    }
}
