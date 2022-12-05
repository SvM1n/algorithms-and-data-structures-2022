package ru.mirea.practice.s21k0709.p4.task3;

import java.util.List;

public enum Laptops {
    Macbook(200000),
    Xiaomibook(100000),
    MSI(150000);
    int price;
    Laptops(int price) {
        this.price = price;
    }

    public static void showLaptops() {
        for (Laptops x: Laptops.values()) {
            System.out.println(x);
        }
    }

    public static void getLaptops(List<String> a) {
        for (Laptops x: Laptops.values()) {
            a.add(x.name());
        }
    }
}
