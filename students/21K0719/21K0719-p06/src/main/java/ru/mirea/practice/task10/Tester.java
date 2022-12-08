package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Computer[] arr = new Computer[3];
        Shop shop = new Shop(arr);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter brand:");
            for (Brand brand : Brand.values()) {
                System.out.print(brand);
                System.out.print(",");
            }
            for (int i = 0; i < 3; i++) {
                shop.addComputers(new Computer(Brand.valueOf(sc.nextLine())), i);
            }
            shop.printComputers();
            System.out.println("Enter brand to find:");
            shop.find(Brand.valueOf(sc.nextLine()));
            System.out.println();
            System.out.println("**************************************");
            shop.printComputers();
            System.out.println("Enter brand of the computer which you want to delete:");
            for (int i = 0; i < 3; i++) {
                shop.deleteComputer(Brand.valueOf(sc.nextLine()));
            }
            System.out.println();
            shop.printComputers();
        }
    }
}
