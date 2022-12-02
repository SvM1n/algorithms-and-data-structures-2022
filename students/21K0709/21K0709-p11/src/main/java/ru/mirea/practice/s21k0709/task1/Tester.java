package ru.mirea.practice.s21k0709.task1;

import java.util.Date;

public abstract class Tester {
    public static void main(String[] args) throws InterruptedException {
        Information info = new Information(new Date(),"Турчанинов Даниил Владимирович");
        Thread.sleep(2000);
        info.setPassedDate(new Date());
        System.out.println(info.toString());
    }
}
