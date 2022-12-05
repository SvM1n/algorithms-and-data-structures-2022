package ru.mirea.practice2.task4;

import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner sc = new Scanner(System.in)) {
            String compName = sc.nextLine();
            int compNumber = sc.nextInt();

            Computer computer1 = new Computer(compName, compNumber);
            shop.addComputer(computer1);

            shop.findPc(computer1.getKey());
            System.out.print(shop);
            shop.delComputer(computer1.getKey());
            System.out.print(shop);
        }


    }
}
