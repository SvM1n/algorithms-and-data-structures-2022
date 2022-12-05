package ru.mirea.practice.s21k0647.zad10;

import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner sc = new Scanner(System.in)) {
            String i = "add";
            while (i.length() != 0) {
                if ("add".equals(i)) {
                    System.out.println("Enter the data: ");
                    Computer c1 = shop.input(sc);
                    shop.addComputer(c1);
                    System.out.println("Do you want to add a computer?");
                    System.out.println("Enter a request:");
                    i = sc.next();
                }
                if ("search".equals(i)) {
                    System.out.println("Enter the model of the computer you want to delete");
                    shop.deleteComputer(sc.next());
                    System.out.println("Enter a request:");
                    i = sc.next();
                }
                if ("search".equals(i)) {
                    System.out.println("Find a computer");
                    System.out.println(shop.searchComputer(sc.next()));
                    System.out.println("Enter a request:");
                    i = sc.next();
                }
                if ("output".equals(i)) {
                    shop.output();
                    i = sc.next();
                }
                if ("end".equals(i)) {
                    i = "";
                }
            }
        }
    }
}
