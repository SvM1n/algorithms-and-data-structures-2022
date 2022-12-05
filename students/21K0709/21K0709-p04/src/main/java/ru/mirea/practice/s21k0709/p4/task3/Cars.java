package ru.mirea.practice.s21k0709.p4.task3;

import java.util.List;

public enum Cars {
    Hyundai(300000),
    Kio(400000),
    Niva(200000);

    int price;
    Cars(int price) {
        this.price = price;
    }

    public static void showCars() {
        for (Cars x: Cars.values()) {
            System.out.println(x);
        }
    }

    public static void getCar(List<String> a) {
        for (Cars x: Cars.values()) {
            a.add(x.name());
        }
    }
}
