package ru.mirea.practice.s21k0709.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class Date {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите дату в формате : yyyy-MM-dd HH:mm:ss ");
            String str = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.util.Date date = format.parse(str);
            System.out.println("Ваша дата " + date);
            java.util.Date currentDate = new java.util.Date();
            System.out.println("Системная дата " + currentDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
