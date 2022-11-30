package ru.mirea.practice.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {

    public static boolean hasAddDigit(String str) {
        Pattern compile = Pattern.compile("\\d+\\s*\\+(\\s*|\\d+)\\b");
        Matcher matcher = compile.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println("(1 ++ 8) - 9 / 4 " + hasAddDigit("(1 ++ 8) - 9 / 4"));
        System.out.println("(1 + 8) - 9 / 4 " + hasAddDigit("(1 + 8) - 9 / 4"));
        System.out.println("6 / 5 -+ 2 * 9 " + hasAddDigit("6 / 5 - 2 * 9"));
    }
}
