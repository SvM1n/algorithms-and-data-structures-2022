package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, int cost, String color) {
        clothesColor = color;
        clothesCost = cost;
        clothesSize = size;
    }

    @Override
    public void dressWoman() {
        System.out.println(clothesColor + clothesCost + clothesSize);
    }
}
