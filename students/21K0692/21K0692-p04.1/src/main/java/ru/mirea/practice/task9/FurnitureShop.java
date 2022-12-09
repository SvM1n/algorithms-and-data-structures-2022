package ru.mirea.practice.task9;

import java.util.Scanner;

public class FurnitureShop {
    public void makePurchase() {
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("1) Стул 2) Шкаф 3) Камин\n");
            choice = sc.nextInt();
            int counter = 0;
            switch (choice) {
                case 1:
                    Chair[] chairs = {new Chair(5000, 4, true),
                        new Chair(2000, 3, false)};

                    System.out.print("1. " + chairs[0] + "\n");
                    System.out.print("2. " + chairs[1] + "\n");
                    int choice1 = sc.nextInt();
                    counter += chairs[choice1 - 1].getCost();
                    break;
                case 2:
                    Wardrobe[] wardrobes = {new Wardrobe(9000, 4, 10),
                        new Wardrobe(14000, 3, 6)};

                    System.out.print("1. " + wardrobes[0] + "\n");
                    System.out.print("2. " + wardrobes[1] + "\n");
                    int choice2 = sc.nextInt();
                    counter += wardrobes[choice2 - 1].getCost();
                    break;
                case 3:
                    Fireplace[] fireplaces = {new Fireplace(12000, 4, 220),
                        new Fireplace(20000, 3, 340)};

                    System.out.print("1. " + fireplaces[0] + "\n");
                    System.out.print("2. " + fireplaces[1] + "\n");
                    int choice3 = sc.nextInt();
                    counter += fireplaces[choice3 - 1].getCost();
                    break;
                default:
                    break;
            }
            System.out.print("С вас " + counter);
        }
    }
}
