package ru.mirea.practice.task1;

import java.util.Date;

public abstract class Test {
    public static void main(String[] args) throws InterruptedException {
        Developer developer = new Developer("Денис Давыдов", new Date());
        Thread.sleep(1000);
        developer.setEndDate(new Date());
        System.out.println(developer.toString());
    }
}
