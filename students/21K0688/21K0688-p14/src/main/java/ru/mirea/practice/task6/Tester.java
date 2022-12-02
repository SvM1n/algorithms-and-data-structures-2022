package ru.mirea.practice.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("user@mail.ru " + check("user@mail.ru"));
        System.out.println(" @bk.ru " + check("@bk.ru"));
        System.out.println("myhost@@@com.ru " + check("myhost@@@com.ru"));
        System.out.println("1arsushaXudyakou2003@gmail.com " + check("1arsushaXudyakou2003@gmail.com"));
    }

    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("\\D\\w+@\\w+\\.+\\w+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
