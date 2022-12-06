package ru.mirea.practice.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("(9 + 8) / 2 " + check("(9 + 8) / 2"));
        System.out.println("(1 - 8) - 5 " + check("(1 - 8) - 5"));
        System.out.println("6 / 5 + 3 " + check("6 / 5 + 3"));
    }

    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("\\d+\\s*\\+");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
