package ru.mirea.workeleven.task2;

import java.util.Date;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Date userDate = new Date(122, 10, 2);
        Date curDate = new Date();
        if (userDate.getYear() == curDate.getYear()
                && userDate.getMonth() == curDate.getMonth()
                && userDate.getDay() == curDate.getDay()) {
            System.out.println("Даты равны");
        } else {
            System.out.println("Даты не равны");
        }
    }
}
