package ru.mirea.practice.task4.s21k0627;

import java.util.Scanner;

public abstract class Shop {
    public static void main(String[] args) {
        Computer[] shop = new Computer[10];
        shop[0] = new Computer("win", 85000, 2018);
        shop[1] = new Computer("mac", 110000, 2020);
        shop[2] = new Computer("win", 170000, 2022);
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("how much new computers?");
            n = sc.nextInt() + 3;
            for (int i = 3; i < n; i++) {
                System.out.println("enter os, price and year of model: ");
                shop[i] = new Computer(sc.next(), sc.nextInt(), sc.nextInt());
            }
        }
        for (Computer j : shop) {
            if (j != null) {
                System.out.println(j.toString());
            }
        }
    }
}