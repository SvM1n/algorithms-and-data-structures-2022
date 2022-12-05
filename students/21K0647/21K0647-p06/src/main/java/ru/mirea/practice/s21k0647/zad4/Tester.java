package ru.mirea.practice.s21k0647.zad4;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Product product = new Product("T-Shirt", 1000);
        System.out.println(product);
        Service service = new Service("Клининг", 3, 2500);
        System.out.println(service);
    }
}
