package ru.mirea.practice.task2;

public class Atelier implements MenClothing, WomenClothing {

    public Clothes[] array;

    public Atelier(Clothes[] array) {
        this.array = array;
    }

    public void dressMan() {
        System.out.println("Clothes for man: ");
        for (Clothes clothes : array) {
            if (clothes instanceof MenClothing) {
                System.out.println(clothes);
            }
        }
    }


    public void dressWomen() {
        System.out.println("Clothes for woman: ");
        for (Clothes clothes : array) {
            if (clothes instanceof WomenClothing) {
                System.out.println(clothes);
            }
        }
    }
}
