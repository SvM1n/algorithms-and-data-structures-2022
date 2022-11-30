package ru.mirea.practice.solutiontask3;

public class Products {
    private final int cost;
    private final String name;

    public Products(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " цена за ед товара " + this.cost;
    }
}
