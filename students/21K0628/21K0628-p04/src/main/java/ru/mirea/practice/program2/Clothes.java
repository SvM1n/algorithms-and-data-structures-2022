package ru.mirea.practice.program2;

public abstract class Clothes implements MenClothing, WomenClothing {
    Size s;
    int price;
    String colour;

    public void dressMen() {
        System.out.println("");
    }

    public void dressWomen() {
        System.out.println("");
    }
}
