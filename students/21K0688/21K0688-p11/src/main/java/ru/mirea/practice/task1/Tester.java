package ru.mirea.practice.task1;

import java.util.Date;
import java.util.Calendar;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        Programmer programmer = new Programmer("Арсюша Худякоу", calendar.getTime());
        programmer.setEnd(new Date());
        System.out.print(programmer);
    }
}
