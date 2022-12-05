package ru.mirea.practice.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Time {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Inter the date in format yyyy-mm-dd");
            String dateString = sc.nextLine();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
            System.out.println("Your date: " + new SimpleDateFormat().format(date));
            System.out.println("Current date: " + new Date());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
