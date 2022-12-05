package ru.mirea.practice.s21k0709.p4.task2;

public abstract class Clothes implements MenClothing, WomenClothing {
    Size size; // по умолчанию public
    int price;
    String color;

    @Override
    public void dressMan() {
        System.out.print("");

    }

    @Override
    public void dressWomen() {
        System.out.print("");
    }
}

