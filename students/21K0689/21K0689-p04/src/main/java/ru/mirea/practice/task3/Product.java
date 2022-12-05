package ru.mirea.practice.task3;

public class Product {
    private final String productName;
    private final double price;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName + ", price is: " + price + " USD";
    }
}