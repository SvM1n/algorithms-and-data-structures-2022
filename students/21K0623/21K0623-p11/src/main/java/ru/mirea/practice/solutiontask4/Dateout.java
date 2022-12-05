package ru.mirea.practice.solutiontask4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public final class Dateout {
    private Dateout() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calendar dates = new GregorianCalendar();
            System.out.print("Введите год: ");
            dates.set(Calendar.YEAR, sc.nextInt());
            System.out.print("Введите месяц: ");
            dates.set(Calendar.MONTH, sc.nextInt());
            System.out.print("Введите день: ");
            dates.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            System.out.println(dates.getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd");
            System.out.println(sdf.format(dates.getTime()));
        }
    }
}
