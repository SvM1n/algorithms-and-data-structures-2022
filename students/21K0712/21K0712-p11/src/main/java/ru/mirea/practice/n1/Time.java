package ru.mirea.practice.n1;


import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

abstract class Time {
    public static void main(String[] args) {
        System.out.println("Farkhutdinov");
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd MMMM yyyy");
        System.out.println("Task received: " + sdf.format(calendar.getTime()));
        Date moment = new Date();
        System.out.println("Task submitted: " + moment);

        System.out.println();
        if (moment.compareTo(calendar.getTime()) == 0) {
            System.out.println("=");
        } else if (moment.compareTo(calendar.getTime()) > 0) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input year: ");
            int year = scanner.nextInt();
            calendar.set(Calendar.YEAR, year);

            System.out.print("Input month: ");
            int month = scanner.nextInt();
            calendar.set(Calendar.MONTH, month);

            System.out.print("Input day: ");
            int day = scanner.nextInt();
            calendar.set(Calendar.DAY_OF_MONTH, day);

            System.out.println("Calendar: " + sdf.format(calendar.getTime()));

            long start = System.currentTimeMillis();
            long estimated = System.currentTimeMillis() - start;
            System.out.println(estimated);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}
