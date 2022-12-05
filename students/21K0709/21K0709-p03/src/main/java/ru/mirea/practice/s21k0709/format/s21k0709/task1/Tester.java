package ru.mirea.practice.s21k0709.format.s21k0709.task1;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("Write the number you want to translate ");
        System.out.println("converted from code land");
        System.out.println("In language code");
        System.out.println("In land code");
        System.out.println("Exchange rate from currency to currency");
        try (Scanner sc = new Scanner(System.in)) {
            Converter app = new Converter(sc.nextDouble(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
            app.formated();
            System.out.print(app.toString());
        }
    }
}