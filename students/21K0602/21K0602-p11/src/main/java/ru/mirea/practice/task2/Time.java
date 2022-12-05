package ru.mirea.practice.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Time {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter date in format : yyyy-MM-dd HH:mm:ss ");
            String str = in.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = formatter.parse(str);
            System.out.println("your date " + date);
            Date currentDate = new Date();
            System.out.println("current date " + currentDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
