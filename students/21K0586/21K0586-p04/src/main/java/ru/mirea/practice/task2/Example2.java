package ru.mirea.practice.task2;

public abstract class Example2 {
    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.XS, "белый"),
            new TShirt(Size.L, "черный", 250),
            new Pants(Size.M, "голубой", 500),
            new Pants(Size.XXS, "синий"),
            new Skirt(Size.S, "розовый", 400),
            new Skirt(Size.M, "красный"),
            new Tie(Size.L, "синий", 300),
            new Tie(Size.L, "красный", 280),
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}
