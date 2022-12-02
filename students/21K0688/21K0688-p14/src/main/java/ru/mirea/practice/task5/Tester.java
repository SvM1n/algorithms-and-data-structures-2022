package ru.mirea.practice.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("29/02/2000 " + check("29/02/2000"));
        System.out.println("30/04/2003 " + check("30/04/2003"));
        System.out.println("01/01/1899 " + check("01/01/1899"));
        System.out.println("02-03-1999 " + check("02-03-1999"));
    }

    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("[1-3]\\d/((1[0-2])|(0[1-9]))/((19\\d{2})|([2-9]\\d{3}))");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
