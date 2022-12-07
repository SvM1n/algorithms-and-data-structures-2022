package ru.mirea.practice.formatting.program2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class Shop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Products p1 = new Products("Crochet pattern #1", 10.99);
        Products p2 = new Products("Crochet pattern #2", 7.99);
        Products p3 = new Products("Crochet pattern #3", 4.99);
        System.out.println("Available chochet patterns:" + p1 + p2 + p3);
        int number;
        int current;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nChoose a pattern (number)");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            number = sc.nextInt();
            System.out.println("Choose a currency (number):\n1. USD\n2. EUR\n3. GBP\n4. CNY\n");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            current = sc.nextInt();
        }
        double price = 0;
        switch (number) {
            case 1:
                price = p1.getPrice();
                break;
            case 2:
                price = p2.getPrice();
                break;
            case 3:
                price = p3.getPrice();
                break;
            default:
                System.out.println("Invalid number entered");
                break;
        }
        switch (current) {
            case 1:
                NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
                System.out.println("Price: " + numberFormat1.format(price));
                break;
            case 2:
                NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                System.out.println("Price: " + numberFormat2.format(price * 0.95));
                break;
            case 3:
                NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.UK);
                System.out.println("Price: " + numberFormat3.format(price * 0.81));
                break;
            case 4:
                NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                System.out.println("Price: " + numberFormat4.format(price * 7.03));
                break;
            default:
                System.out.println("Invalid current entered");
                break;
        }
    }
}