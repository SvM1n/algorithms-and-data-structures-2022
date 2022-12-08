package ru.mirea.practice.task2;

abstract class Test {
    public static void main(String[] args) {
        Clothes[] arr = {new Pants(Size.M, 2500, "серый"),
                         new Skirt(Size.S, 80000, "сиреневый"),
                         new Tie(Size.M, 5500, "синий"),
                         new TShirt(Size.XS, 1100, "красный")};

        Atelier atelier = new Atelier();
        atelier.dressMan(arr);
        System.out.print("\n");
        atelier.dressWoman(arr);
    }
}
