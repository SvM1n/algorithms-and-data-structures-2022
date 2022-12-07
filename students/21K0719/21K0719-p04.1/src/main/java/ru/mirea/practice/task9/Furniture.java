package ru.mirea.practice.task9;

public abstract class Furniture {
    private int price;
    private int weight;

    public Furniture(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}