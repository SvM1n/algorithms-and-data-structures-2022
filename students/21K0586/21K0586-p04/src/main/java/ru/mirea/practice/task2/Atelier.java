package ru.mirea.practice.task2;

public class Atelier implements MenClothing, WomenClothing {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothing) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothing) {
                System.out.println(clothe);
            }
        }
    }
}
