package ru.mirea.practice.task2;

abstract class Tester {
    public static void main(String[] args) {
        Clothes[] arr = {new Skirt(Sizes.L, 1200, "Черный"),
            new Pants(Sizes.M, 1000, "Серый"),
            new Tie(Sizes.XS, 1500, "Красный"),
            new TShirt(Sizes.XXS, 500, "Синий")};

        Atelier test = new Atelier();
        test.dressMan(arr);
        System.out.print("\n");
        test.dressWoman(arr);
    }
}

