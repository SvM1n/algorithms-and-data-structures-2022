package ru.mirea.practice.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class FormatDate {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Inter year: ");
            int year = sc.nextInt();
            cal.set(Calendar.YEAR, year);

            System.out.print("Inter month: ");
            int month = sc.nextInt();
            cal.set(Calendar.MONTH, month - 1);

            System.out.print("Inter day: ");
            int day = sc.nextInt();
            cal.set(Calendar.DAY_OF_MONTH, day);

            System.out.println(sdf.format(cal.getTime()));
        }
    }
}
