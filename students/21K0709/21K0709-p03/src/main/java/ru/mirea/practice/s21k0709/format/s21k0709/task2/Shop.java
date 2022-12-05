package ru.mirea.practice.s21k0709.format.s21k0709.task2;

public class Shop {
    int price;
    String name;

    public Shop(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}