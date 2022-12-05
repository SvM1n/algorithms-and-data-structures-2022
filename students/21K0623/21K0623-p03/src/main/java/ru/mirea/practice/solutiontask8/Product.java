package ru.mirea.practice.solutiontask8;

public class Product {
    private final String name;
    private final double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
