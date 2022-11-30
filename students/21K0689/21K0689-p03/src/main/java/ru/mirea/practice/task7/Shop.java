package ru.mirea.practice.task7;


import ru.mirea.practice.task6.Converter;

import java.util.Scanner;

public abstract class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double val = 0.0;
            String rub = "руб";
            String product = "";
            System.out.println("Which product would you like to buy: CPU, Motherboard, Monitor");
            product = sc.next();
            switch (product) {
                case "CPU":
                    val = 13500;
                    break;
                case "Motherboard":
                    val = 7500;
                    break;
                case "Monitor":
                    val = 22999;
                    break;
                default:
                    System.out.println("We have no this product");
                    break;
            }
            Converter converter = new Converter();
            System.out.println("Dollars, rubles or euro?");
            String cur = " ";
            cur = sc.next();
            switch (cur) {
                case "Dollars":
                    converter.dollar(val);
                    break;
                case "euro":
                    converter.euro(val);
                    break;
                case "rubles":
                    System.out.println(val + rub);
                    break;
                default:
                    System.out.println("Don't know what currency it is");
                    break;
            }
        } finally {
            sc.close();
        }

    }
}
