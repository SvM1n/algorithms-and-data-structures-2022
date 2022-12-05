package ru.mirea.practice.task2;

public class Atelier implements MenClothing, WomenClothing {
    public void dressMan(Clothes[] arr) {
        System.out.println("Мужчинам:");
        for (Clothes clothes : arr) {
            if (clothes instanceof MenClothing) {
                System.out.println(clothes.toString());
            }
        }
    }

    public void dressWoman(Clothes[] arr) {
        System.out.println("Женщинам:");
        for (Clothes clothes : arr) {
            if (clothes instanceof WomenClothing) {
                System.out.println(clothes.toString());
            }
        }
    }

}
