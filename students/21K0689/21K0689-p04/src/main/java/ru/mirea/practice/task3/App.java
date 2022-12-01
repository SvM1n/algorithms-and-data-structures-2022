package ru.mirea.practice.task3;

import java.util.Scanner;

public abstract class App {
    public static void main(String[] args) {
        User user;
        try (Scanner scanner = new Scanner(System.in)) {
            user = new User("John", "qwerty");
            if (!user.check(scanner)) {
                System.out.println("User does not exist");
                return;
            }
        }


        System.out.println("--------------------------");
        Catalog.getCatalog();

        user.cart.addProduct(Catalog.MEN.getProduct(1));
        user.cart.addProduct(Catalog.MEN.getProduct(2));
        user.cart.addProduct(Catalog.MEN.getProduct(2));
        user.cart.addProduct(Catalog.MEN.getProduct(3));
        user.cart.deleteProduct(Catalog.MEN.getProduct(2));
        user.cart.showProducts();
    }
}
