package ru.mirea.practice.s21k0709.p4.task3;

import java.util.List;

public enum Smartphones {
    Xiaomi9T(20000),
    IPhone12(60000),
    IPhone13Pro(90000),
    GooglePixel4a(45000);
    int price;
    Smartphones(int price) {
        this.price = price;
    }

    public static void showSmartphones() {
        for (Smartphones x: Smartphones.values()) {
            System.out.println(x);
        }
    }

    public static void getSmartphones(List<String> a) {
        for (Smartphones x: Smartphones.values()) {
            a.add(x.name());
        }
    }
}
