package ru.mirea.practice.s21k0709.task4;

public abstract class Tester {
    public static void main(String[] args) {
        String[] shirts1 = new String[]{
            "S001, Black Polo Shirt, Black, XL",
            "S002, Black Polo Shirt, Black, L",
            "S003, Blue Polo Shirt, Blue, XL",
            "S004, Blue Polo Shirt, Blue, M",
            "S005, Tan Polo Shirt, Tan, XL",
            "S006, Black T-Shirt, Black, XL",
            "S007, White T-Shirt, White, XL",
            "S008, White T-Shirt, White, L",
            "S009, Green T-Shirt, Green, S",
            "S010, Orange T-Shirt, Orange, S",
            "S011, Maroon Polo Shirt, Maroon, S"
        };
        Shirts[] shirts2 = new Shirts[shirts1.length];
        for (int i = 0; i < shirts1.length; i++) {
            shirts2[i] = new Shirts(shirts1[i]);
            System.out.println(shirts2[i].toString());
        }

    }
}
