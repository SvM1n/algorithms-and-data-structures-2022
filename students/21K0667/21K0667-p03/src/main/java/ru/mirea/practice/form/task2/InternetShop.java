package ru.mirea.practice.form.task2;


import ru.mirea.practice.form.task1.Convertor;

import java.util.Scanner;

abstract class InternetShop {
    public static void main(String[] args) {
        String language;
        String land;
        double course;
        String currency;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write your currency: ");
            currency = scanner.nextLine();
            System.out.println("Write your language code: ");
            language = scanner.nextLine();
            System.out.println("Write your land code");
            land = scanner.nextLine();
            System.out.println("Exchange rate from dollar to your currency:");
            course = scanner.nextDouble();
        }
        double bread = 0.5;
        double milk = 1.5;
        double cheese = 2;
        Convertor usersCurrency = new Convertor(language, land, course, currency);
        System.out.println("bread: " + usersCurrency.convert(bread));
        System.out.println("milk: " + usersCurrency.convert(milk));
        System.out.println("cheese: " + usersCurrency.convert(cheese));
    }
}