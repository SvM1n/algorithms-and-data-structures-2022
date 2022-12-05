package ru.mirea.practice.solutiontask2;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Clothes[] clothes = {new TShirt(Size.M, 1000, "green"),
                             new TShirt(Size.XS, 400, "white"),
                             new Pants(Size.L, 2000, "blue"),
                             new Skirt(Size.XS, 800, "black"),
                             new Tie(Size.XS, 300, "black")};
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}
