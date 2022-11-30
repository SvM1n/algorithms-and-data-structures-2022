package ru.mirea.practice.program4;

import java.util.Scanner;

abstract class TestShop {
    private static void menu() {
        System.out.println("Choose the category you prefer:");
        System.out.println("\n");
        System.out.println("To search the computer in the catalog (enter: 1)");
        System.out.println("\t");
        System.out.println("To delete the computer(enter 2)");
        System.out.println("\t");
        System.out.println("To add the computer (enter 3)");
        System.out.println("\n");
        System.out.println("To exit enter 0");
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Welcome in the shop!");
        System.out.println("\n");
        boolean exit = false;
        try (Scanner sc = new Scanner(System.in)) {
            while (!exit) {
                menu();
                switch (sc.nextInt()) {
                    case 1: {
                        System.out.println("Existing types: desktop,smartphone,notebook");
                        System.out.println("\n");
                        System.out.println("Enter the type of computer:");
                        shop.searchComputer(sc.next());
                        continue;
                    }
                    case 2: {
                        System.out.println("Enter type of computer you want to delete(Existing types: desktop,smartphone,notebook)");
                        System.out.println("\n");
                        System.out.println("Enter the ID:");
                        shop.deleteComputer(sc.nextInt());
                        System.out.println("Success!");
                        continue;
                    }
                    case 3: {
                        System.out.println("Enter the type of computer and it's capacity:");
                        shop.addComputer(sc.next(), sc.nextInt());
                        continue;
                    }
                    case 0: {
                        exit = true;
                        break;
                    }
                    default: {
                        System.out.println("Error!");
                        break;
                    }
                }
            }
        }
    }
}
