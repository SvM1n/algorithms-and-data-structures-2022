package ru.mirea.practice.solutiontask2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calendar dateget = new GregorianCalendar();
            System.out.println("Введите год:");
            dateget.set(Calendar.YEAR, sc.nextInt());
            System.out.println("Введите месяц:");
            dateget.set(Calendar.MONTH, sc.nextInt() - 1);
            System.out.println("Введите день:");
            dateget.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            System.out.println("Введите час:");
            dateget.set(Calendar.HOUR_OF_DAY, sc.nextInt());
            System.out.println("Введите минуты:");
            dateget.set(Calendar.MINUTE, sc.nextInt());
            System.out.println("Введите секунды:");
            dateget.set(Calendar.SECOND, sc.nextInt());

            Date first = dateget.getTime();
            Date second = new Date();
            System.out.println(first.getTime() > second.getTime() ? "Введенное время позже настоящего" : "Введенное раньше настоящего");
        }
    }
}
