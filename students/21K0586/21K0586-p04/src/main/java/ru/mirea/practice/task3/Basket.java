package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("Текущая корзина: ");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
