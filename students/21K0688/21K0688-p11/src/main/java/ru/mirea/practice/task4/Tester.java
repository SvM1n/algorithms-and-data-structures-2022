package ru.mirea.practice.task4;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Год: ");
            date.set(Calendar.YEAR, sc.nextInt());
            System.out.print("Месяц: ");
            date.set(Calendar.MONTH, sc.nextInt());
            System.out.print("День: ");
            date.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            System.out.print("Час: ");
            date.set(Calendar.HOUR, sc.nextInt());
            System.out.print("Минута: ");
            date.set(Calendar.MINUTE, sc.nextInt());

            System.out.print(date.getTime());
        }
    }
}
