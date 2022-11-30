package ru.mirea.practice.task9;

import java.util.Scanner;

public class FurnitureShop {
    public void work() {
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1)Стул, 2)Тумбочка, 3)Кровать");
            choice = sc.nextInt();
            double counter = 0;
            switch (choice) {
                case 1:
                    Chair[] chairs = {new Chair(3000, 1.1, false), new Chair(4000, 1.5, true)};
                    System.out.println("1) " + chairs[0]);
                    System.out.println("2) " + chairs[1]);
                    int choice1 = sc.nextInt();
                    counter += chairs[choice1 - 1].getCost();
                    break;
                case 2:
                    BedsideTable[] bedsideTables = {new BedsideTable(5000, 3.5, "aaAA"), new BedsideTable(6000, 4.5, "bbBB")};
                    System.out.println("1. " + bedsideTables[0]);
                    System.out.println("2. " + bedsideTables[1]);
                    int choice2 = sc.nextInt();
                    counter += bedsideTables[choice2 - 1].getCost();
                    break;
                case 3:
                    Bed[] beds = {new Bed(10000, 15, "Full"), new Bed(35000, 15, "Queen")};

                    System.out.println("1. " + beds[0]);
                    System.out.println("2. " + beds[1]);
                    int choice3 = sc.nextInt();
                    counter += beds[choice3 - 1].getCost();
                    break;
                default:
                    break;
            }
            System.out.print("Стоимость: " + counter);
        }
    }
}
