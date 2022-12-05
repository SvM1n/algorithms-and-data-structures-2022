package ru.mirea.practice.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter year");
            date.set(Calendar.YEAR, in.nextInt());
            System.out.println("Enter month");
            date.set(Calendar.MONTH, in.nextInt());
            System.out.println("Enter day");
            date.set(Calendar.DAY_OF_MONTH, in.nextInt());
            System.out.println("Enter hour");
            date.set(Calendar.HOUR, in.nextInt());
            System.out.println("Enter minute");
            date.set(Calendar.MINUTE, in.nextInt());

            System.out.println(formatter.format(date.getTime()));
        }
    }
}
