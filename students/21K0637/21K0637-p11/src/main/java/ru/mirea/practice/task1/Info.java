package ru.mirea.practice.task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Info {
    public static void main(String[] args) {
        System.out.println("Korsunov I.V");
        Calendar cal = Calendar.getInstance();
        cal.set(2022, Calendar.NOVEMBER, 12, 10, 48);
        System.out.println("Task accepted: " + new SimpleDateFormat().format(cal.getTime()));
        System.out.println("Task is completed: "  + new Date(System.currentTimeMillis()));
    }
}
