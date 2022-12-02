package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Your cart is currently empty.");
        } else {
            System.out.println("Your cart: ");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}