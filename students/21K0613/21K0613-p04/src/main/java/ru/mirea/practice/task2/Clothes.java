package ru.mirea.practice.task2;

public abstract class Clothes implements MenClothing, WomenClothing {
    protected Sizes clothesSize;
    protected int clothesCost;
    protected String clothesColor;

    @Override
    public void dressWoman() {
        System.out.println();
    }

    @Override
    public void dressMan() {
        System.out.println();
    }
}
