package ru.mirea.practice.s21k0709.format.s21k0709.task2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        ArrayList<Shop> c = new ArrayList<>();
        Shop a1 = new Shop("product1", 123);
        c.add(a1);
        Shop a2 = new Shop("product2", 56);
        c.add(a2);
        Shop a3 = new Shop("product3", 1000);
        c.add(a3);
        Shop a4 = new Shop("product4", 532);
        c.add(a4);
        Shop a5 = new Shop("product5", 976);
        c.add(a5);

        for (Shop x: c) {
            System.out.println(x.name + "\t" + x.price);
        }

        try (Scanner source = new Scanner(System.in)) {
            System.out.println("Add product to cart?");
            String s = source.nextLine();
            ArrayList<Shop> basket = new ArrayList<>();
            float sumBasket = 0;
            while ("yes".equals(s)) {
                String s1 = source.next();
                for (Shop x : c) {
                    if (s1.equals(x.name)) {
                        basket.add(x);
                        sumBasket += x.price;
                    }
                }
                System.out.println("Add product to cart?");
                s = source.next();
            }

            Locale.setDefault(new Locale("ru", "RU"));
            NumberFormat format = NumberFormat.getCurrencyInstance();
            System.out.println("Amount in rubles: " + format.format(sumBasket));
            System.out.println("Convert to another currency?");
            String conv = source.next();
            if ("yes".equals(conv)) {
                System.out.print("Enter the currency language code: ");
                String kodLang = source.next();
                System.out.print("Enter the country code of the currency: ");
                String kodLand = source.next();
                System.out.print("Enter the course");
                double course = source.nextDouble();
                Converter converter = new Converter(kodLang, kodLand, course);
                System.out.println(converter.converter(kodLang, kodLand, course, sumBasket));
            }
        }
    }
}