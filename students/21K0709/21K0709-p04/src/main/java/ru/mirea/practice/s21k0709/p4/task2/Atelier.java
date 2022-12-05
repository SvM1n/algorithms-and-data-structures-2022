package ru.mirea.practice.s21k0709.p4.task2;

import java.util.ArrayList;
import java.util.List;

public final class Atelier {
    private Atelier() {
        //
    }

    public static void dressMen(List<Clothes> a) {
        String info = "Dress Men: ";
        System.out.println(info);
        for (Clothes x: a) {
            x.dressMan();
        }
        System.out.println();
    }

    public static void dressWomen(List<Clothes> a) {
        String info = "Dress Women: ";
        System.out.println(info);
        for (Clothes x: a) {
            x.dressWomen();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        List<Clothes> clothes = new ArrayList<Clothes>();
        clothes.add(new TShirt(Size.S, 1500, "green"));
        clothes.add(new Pants(Size.M, 5000, "black"));
        clothes.add(new Tie(Size.L, 1000, "white"));
        clothes.add(new Skirt(Size.XXS, 2000, "yellow"));
        dressMen(clothes);
        dressWomen(clothes);
    }
}
