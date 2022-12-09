package ru.mirea.practice.task2;

abstract class Tester {
    public static void main(String[] args) {
        Clothes[] clothes;
        Clothes clothes1 =  new Tie(Size.L, "Black", 2500);
        Clothes clothes2 = new TShirt(Size.S, "White", 800);
        Clothes clothes3 = new Pants(Size.M, "Green", 6000);
        Clothes clothes4 = new Skirt(Size.XXS, "Red", 7500);
        clothes = new Clothes[]{clothes1, clothes2, clothes3, clothes4};
        Atelier atelier = new Atelier(clothes);
        atelier.dressMan();
        atelier.dressWomen();
    }
}
