package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new TShirt(Size.M, 250, "red"));
        clothes.add(new Skirt(Size.L, 120, "black"));
        clothes.add(new Pants(Size.S, 100, "white"));
        clothes.add(new Tie(Size.XS, 90, "orange"));
        clothes.add(new TShirt(Size.XXS, 80, "blue"));

        Atelier atelier = new Atelier();
        atelier.dressWoman(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}
