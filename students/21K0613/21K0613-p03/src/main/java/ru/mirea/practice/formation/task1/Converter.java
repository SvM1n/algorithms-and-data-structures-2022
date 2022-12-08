package ru.mirea.practice.formation.task1;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

abstract class Converter {
    public static void main(String[] args) {
        System.out.println("Введите значение (в рублях)");
        Scanner scn = new Scanner(System.in);
        try {
            double value = 0;
            if (scn.hasNextDouble()) {
                value = scn.nextDouble();
            }

            NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("В доллар:\t" + formatter.format(value / 62));

            NumberFormat formatter1 = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
            System.out.println("В йены:\t" + formatter1.format(value * 2.18));

            NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("В франк:\t" + formatter2.format(value / 15.7));
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
