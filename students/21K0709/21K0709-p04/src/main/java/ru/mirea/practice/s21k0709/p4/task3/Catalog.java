package ru.mirea.practice.s21k0709.p4.task3;

public enum Catalog {
    Cars(),
    Laptops(),
    Smartphones();

    int number;
    public String getInfo() {
        return name();
    }

    public static void showCatalog() {
        for (Catalog x: Catalog.values()) {
            System.out.println(x);
        }
    }
}
