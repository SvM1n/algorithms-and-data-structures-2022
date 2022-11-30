package ru.mirea.practice.solutiontask2;

public class Atelier {

    public void dressWomen(Clothes[] alltypes) {
        for (Clothes clothe: alltypes) {
            clothe.dressWomen();
        }
    }

    public void dressMan(Clothes[] alltypes) {
        for (Clothes clothe: alltypes) {
            clothe.dressMan();
        }
    }
}
