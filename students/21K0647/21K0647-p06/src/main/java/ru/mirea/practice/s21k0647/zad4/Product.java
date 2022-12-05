package ru.mirea.practice.s21k0647.zad4;

public class Product implements Priceable {
    String title;
    int price;

    Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Продукт " + title + "\nЦена " + getPrice();
    }
}
