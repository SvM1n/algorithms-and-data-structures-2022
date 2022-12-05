package ru.mirea.practice3.convertabletasks.shop1;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

abstract class Shop {
    public static void main(String[] args) {
        double goodprice = 0;
        Locale.setDefault(Locale.UK);

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("SHOP\nChoose a good:\n1.Gingerme\n2.Bondage\n3.CUMmersive hat");
            int a = sc.nextInt();
            while (a < 1 | a > 3) {
                System.out.println("Choose a good from the assortiment: ");
                a = sc.nextInt();
            }
            System.out.println("Choose a currency for payment for good:\n1.$\n2.€\n3.¥\n4.£");
            int b = sc.nextInt();
            while (b < 1 | b > 4) {
                System.out.println("Choose a currency:");
                b = sc.nextInt();
            }
            switch (a) {
                case 1:
                    goodprice = 123.45;
                    break;
                case 2:
                    goodprice = 571.09;
                    break;
                case 3:
                    goodprice = 12.79;
                    break;
                default: {
                    System.out.print(" ");
                    break;
                }
            }
            switch (b) {
                case 1: {
                    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
                    goodprice /= 1.12;
                    System.out.println(format.format(goodprice));
                    break;
                }
                case 2: {
                    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    goodprice /= 1.16;
                    System.out.println(format.format(goodprice));
                    break;
                }
                case 3: {
                    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    goodprice /= 7.48;
                    System.out.println(format.format(goodprice));
                    break;
                }
                case 4: {
                    NumberFormat format = NumberFormat.getCurrencyInstance();
                    System.out.println(format.format(goodprice));
                    break;
                }
                default: {
                    System.out.print("  ");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }
}
