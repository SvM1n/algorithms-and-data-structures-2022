package ru.mirea.practice.task2;

public class Atelier {

    public Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void dressMan() {
        for (Clothes clothe : clothes) {
            try {
                ManClothing clothing = (ManClothing) clothe;
                clothing.dressMen();
            } catch (ClassCastException e) {
                System.out.println(clothe.getClass() + "is not for man");
            }
        }
    }

    public void dressWomen() {
        for (Clothes clothe : clothes) {
            try {
                WomenClothing clothing = (WomenClothing) clothe;
                clothing.dressWomen();
            } catch (ClassCastException e) {
                System.out.println(clothe.getClass() + "is not for woman");
            }
        }
    }
}
