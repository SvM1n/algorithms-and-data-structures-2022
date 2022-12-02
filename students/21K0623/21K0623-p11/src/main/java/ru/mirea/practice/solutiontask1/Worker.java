package ru.mirea.practice.solutiontask1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Worker {
    private final String lastname;
    private final Calendar dateget;

    public Worker(String lastname, int yearstart, int month, int day, int hour) {
        this.lastname = lastname;
        dateget = new GregorianCalendar();
        dateget.set(Calendar.YEAR, yearstart);
        dateget.set(Calendar.MONTH, month - 1);
        dateget.set(Calendar.DAY_OF_MONTH, day);
        dateget.set(Calendar.HOUR_OF_DAY, hour);
    }

    public String getLastname() {
        return lastname;
    }

    public Calendar getDateget() {
        return dateget;
    }

    public String workFinish() {
        Date temp = dateget.getTime();
        return "Время начала работы: " + temp.toString() + "\nВремя сдачи работы: " + (new Date()).toString();
    }
}
