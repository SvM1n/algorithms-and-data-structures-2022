package ru.mirea.practice.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) throws ParseException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дату в виде гггг-мм-дд: ");
            String strDate = scanner.nextLine();
            SimpleDateFormat sample = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sample.parse(strDate);
            SimpleDateFormat smd = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println("Ваша дата: " + smd.format(date).toUpperCase(Locale.ENGLISH));

            Date today = new Date();
            System.out.println("Сегодняйшая дата: " + smd.format(today));
        }
    }
}
