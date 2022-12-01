package ru.mirea.practice.task2;

import java.util.List;

public class Atelier implements MenClothing, WomenClothing {
    public void dressMan(List<Clothes> clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothing) {
                System.out.println(clothe);
            }

        }
    }

    public void dressWoman(List<Clothes> clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothing) {
                System.out.println(clothe);
            }

        }
    }

}
