package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {

    public Tie(Sizes size, int cost, String color) {
        clothesColor = color;
        clothesCost = cost;
        clothesSize = size;
    }

    @Override
    public void dressMan() {
        System.out.println(clothesColor + clothesCost + clothesSize);
    }
}
