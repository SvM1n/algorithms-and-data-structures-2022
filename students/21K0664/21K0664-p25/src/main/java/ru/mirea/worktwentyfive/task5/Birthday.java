package ru.mirea.worktwentyfive.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Birthday {

    private static final Pattern DATE_PATTERN = Pattern.compile(

            "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$"
    );

    private static boolean checkString(final String dateAsString) {
        Matcher m = DATE_PATTERN.matcher(dateAsString);
        boolean result = m.matches();
        if (result) {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if (month == 2 && day > 28 && year > 9999) {
                System.out.println("Error");
            }
        }
        return result;
    }

    public static void main(String... args) {
        System.out.println(checkString("29/02/2000"));
        System.out.println(checkString("30/04/2003"));
        System.out.println(checkString("01/01/2003"));
        System.out.println(checkString("29/02/2001"));
        System.out.println(checkString("30-04-2003"));
        System.out.println(checkString("1/1/1899"));
    }


}
