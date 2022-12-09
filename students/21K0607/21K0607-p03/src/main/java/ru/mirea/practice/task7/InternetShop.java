package ru.mirea.practice.task7;

import java.util.Locale;
import java.util.Scanner;

public abstract class InternetShop {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in).useLocale(Locale.US)) {
            double thing = in.nextDouble(); // rub
            System.out.println("Choice the rate of currency. 1 - dollar, 2 - euro, 3 - other: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Converter converter = new Converter(thing, 0.016563);
                    System.out.format("%.2f", converter.getRate() * converter.getValue());
                    break;
                case 2:
                    Converter converter1 = new Converter(thing, 0.016013);
                    System.out.format("%.2f", converter1.getRate() * converter1.getValue());
                    break;
                case 3:
                    Converter converter2 = new Converter(thing, 0);
                    System.out.println("Enter the exchange rate of the ruble to the currency: ");
                    converter2.setRate(in.nextDouble());
                    System.out.format("%.2f", converter2.getRate() * converter2.getValue());
                    break;
                default:
                    break;
            }
        }
    }
}
