package ru.mirea.practice.program2;

import java.util.ArrayList;
import java.util.List;

public final class Atelier {
    private Atelier() {
    }

    public static void dressMen(List<Clothes> a) {
        String info = "Dress Men: ";
        System.out.println(info);
        for (Clothes x : a) {
            x.dressMen();
        }
        System.out.println();
    }

    public static void dressWomen(List<Clothes> a) {
        String info = "Dress Women: ";
        System.out.println(info);
        for (Clothes x : a) {
            x.dressWomen();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new TShirt(Size.S, 2000, "white"));
        clothes.add(new Pants(Size.L, 5000, "black"));
        clothes.add(new Skirt(Size.M, 2500, "brown"));
        clothes.add(new Tie(Size.XXS, 1000, "black"));
        dressMen(clothes);
        dressWomen(clothes);
    }
}
