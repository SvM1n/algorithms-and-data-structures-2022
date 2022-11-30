package ru.mirea.practice.formatting;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class Shop {
    public static void main(String[] args) {
        double shoes;
        double cigarettes;
        double lemons;
        shoes = 100;
        cigarettes = 15;
        lemons = 10;

        System.out.println("What currency do you want to pay with: ");
        System.out.println("(1) Dollars (2) Euros (3) Yuan ");
        try (Scanner scanner = new Scanner(System.in)) {
            int currency = scanner.nextInt();
            switch (currency) {
                case 1:
                    NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                    System.out.println(numberFormat1.format(shoes) + " are shoes");
                    System.out.println(numberFormat1.format(cigarettes) + " is cigarettes");
                    System.out.println(numberFormat1.format(lemons) + " is lemons");
                    break;
                case 2:
                    shoes = shoes / 0.8957;
                    cigarettes = cigarettes / 0.8957;
                    lemons = lemons / 0.8957;
                    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
                    System.out.println(numberFormat2.format(shoes) + " are shoes");
                    System.out.println(numberFormat2.format(cigarettes) + " is cigarettes");
                    System.out.println(numberFormat2.format(lemons) + " is lemons");
                    break;
                case 3:
                    shoes = shoes * 60.37;
                    cigarettes = cigarettes * 60.37;
                    lemons = lemons * 60.37;
                    NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    System.out.println(numberFormat3.format(shoes) + " are shoes");
                    System.out.println(numberFormat3.format(cigarettes) + " is cigarettes");
                    System.out.println(numberFormat3.format(lemons) + " is lemons");
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }
}