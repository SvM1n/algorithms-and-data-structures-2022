package ru.mirea.practice.task2;

public final class TestAtelier {
    public static void main(String[] args) {

        Clothes[] clothes = {
            new Tshirt(Sizes.M, "white", 1500),
            new Pants(Sizes.L, "blue", 5000),
            new Skirt(Sizes.XXS, "yellow", 10000),
            new Tie(Sizes.S, "red", 3500)
        };

        Atelier atelier = new Atelier(clothes);

        atelier.dressWomen();
        atelier.dressMan();

    }
}

