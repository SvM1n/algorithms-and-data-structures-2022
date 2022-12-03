package ru.mirea.practice.formatting;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public final class Program1 {
    private Program1() {
    }

    public static void main(String[] args) {
        int currency;
        double amount;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose a currency from which to transfer:\n1. USD\n2. EUR\n3. GBP\n4. CNY");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            currency = sc.nextInt();
            System.out.println("Enter an amount");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            amount = sc.nextDouble();
        }
        switch (currency) {
            case 1:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount * 0.95));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.UK).format(amount * 0.81));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount * 7.03));
                break;
            case 2:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.US).format(amount * 1.05));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.UK).format(amount * 0.86));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount * 7.4));
                break;
            case 3:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.US).format(amount * 1.23));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount * 1.16));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount * 8.63));
                break;
            case 4:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.US).format(amount * 0.14));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount * 0.13));
                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount)
                        + " = " + NumberFormat.getCurrencyInstance(Locale.UK).format(amount * 0.116));
                break;
            default:
                break;
        }
    }
}
