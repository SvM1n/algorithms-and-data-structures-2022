package ru.mirea.practice.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calendar {
    private int day;
    private int month;
    private int year;


    public Calendar(String date) {
        if (isMatchPattern(date)) {
            String[] strings = date.split("/");
            day = Integer.parseInt(strings[0]);
            month = Integer.parseInt(strings[1]);
            year = Integer.parseInt(strings[2]);
        } else {
            day = 0;
            month = 0;
            year = 0;

        }

    }

    public boolean isMatchPattern(String date) {
        Pattern pattern = Pattern.compile("[1-3]\\d\\/((1[0-2])|(0[1-9]))\\/((19\\d{2})|([2-9]\\d{3}))");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            String[] strings = date.split("/");
            return Integer.parseInt(strings[0]) == 29 && Integer.parseInt(strings[1]) == 2
                    && Integer.parseInt(strings[2]) % 400 != 0;
        }
        return false;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Calendar{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
}
