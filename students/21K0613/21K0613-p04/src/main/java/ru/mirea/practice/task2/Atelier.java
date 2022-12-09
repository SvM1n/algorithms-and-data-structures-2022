package ru.mirea.practice.task2;

public class Atelier {
    public void dressWoman(Clothes[] array) {
        for (Clothes iterator : array) {
            iterator.dressMan();
        }
    }

    public void dressMan(Clothes[] array) {
        for (Clothes iterator : array) {
            iterator.dressWoman();
        }
    }
}
