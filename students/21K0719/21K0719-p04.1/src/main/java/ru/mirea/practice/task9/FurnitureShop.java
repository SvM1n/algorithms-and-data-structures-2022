package ru.mirea.practice.task9;

import java.util.Scanner;

public class FurnitureShop {
    public void makePurchase() {
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("1) Стул 2) Стол\n");
            choice = sc.nextInt();
            int counter = 0;
            switch (choice) {
                case 1:
                    Chair[] chairs = {new Chair(10000, 5, true),
                                      new Chair(1000, 100, false)};

                    System.out.print("1. " + chairs[0] + "\n");
                    System.out.print("2. " + chairs[1] + "\n");
                    int choice1 = sc.nextInt();
                    counter += chairs[choice1 - 1].getPrice();
                    break;
                case 2:
                    Table[] tables = {new Table(3700, 4, 10),
                                      new Table(2500, 3, 6)};

                    System.out.print("1. " + tables[0] + "\n");
                    System.out.print("2. " + tables[1] + "\n");
                    int choice2 = sc.nextInt();
                    counter += tables[choice2 - 1].getPrice();
                    break;
                default:
                    break;
            }
            System.out.print("С вас " + counter);
        }
    }
}
