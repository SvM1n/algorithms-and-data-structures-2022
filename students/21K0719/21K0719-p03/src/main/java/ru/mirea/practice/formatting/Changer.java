package ru.mirea.practice.formatting;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class Changer {
    public static void main(String[] args) {
        double dollar;
        double euro;
        double yuan;
        System.out.print("1) Euro 2) Dollar 3) Yuan\n");
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            choice = sc.nextInt();
            double number;
            System.out.print("Enter the value you want to convert: ");
            number = sc.nextDouble();

            switch (choice) {
                case 1:
                    NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                    dollar = number * 0.6957;
                    System.out.println(numberFormat1.format(dollar));
                    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    yuan = number * 60.09;
                    System.out.println(numberFormat2.format(yuan));
                    break;
                case 2:
                    NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    euro = number / 0.8957;
                    System.out.println(numberFormat3.format(euro));
                    NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    yuan = number * 60.37;
                    System.out.println(numberFormat4.format(yuan));
                    break;
                case 3:
                    NumberFormat numberFormat5 = NumberFormat.getCurrencyInstance(Locale.US);
                    dollar = number / 60.09;
                    System.out.println(numberFormat5.format(dollar));
                    NumberFormat numberFormat6 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    euro = number / 60.37;
                    System.out.println(numberFormat6.format(euro));
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
        }
    }
}
