package ru.mirea.practice.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("12345Qwerty " + check("12345Qwerty"));
        System.out.println("134 " + check("134"));
        System.out.println("QwwwEEE 3456 " + check("QwwwEEE 3456"));
        System.out.println("myPassword_2517 " + check("myPassword_2517"));
    }

    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])\\w{8,}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
