package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        List<Computer> assortment;
        assortment = new ArrayList<Computer>();
        Shop shop = new Shop();
        shop.setAssortment(assortment);
        Scanner scan = new Scanner(System.in);
        try {
            int check;
            boolean boo = true;
            while (boo) {
                System.out.println("What do you want to do?");
                System.out.println("1 - add computer \n2 - delete computer \n3 - search computer \n4 - stop the program");
                check = scan.nextInt();

                if (check == 1) {
                    System.out.println("Enter type of computer, model and price");
                    String type = scan.next();
                    String model = scan.next();
                    double price = scan.nextDouble();
                    shop.addComp(type, model, price);
                    shop.print();

                } else if (check == 2) {
                    System.out.println("Enter type of computer, model and price");
                    String type = scan.next();
                    String model = scan.next();
                    double price = scan.nextDouble();
                    shop.deleteComp(type, model, price);
                    shop.print();

                } else if (check == 3) {
                    String typeForSearch = scan.next();
                    String modelForSearch = scan.next();
                    double priceForSearch = scan.nextDouble();
                    System.out.println(shop.searchComp(typeForSearch, modelForSearch, priceForSearch));
                    shop.print();

                } else if (check == 4) {
                    boo = !boo;
                } else {
                    System.out.println("Error");
                }
            }
        } finally {
            scan.close();
        }

    }
}