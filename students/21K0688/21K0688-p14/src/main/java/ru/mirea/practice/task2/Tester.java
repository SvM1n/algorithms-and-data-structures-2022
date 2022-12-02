package ru.mirea.practice.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern.matcher("abcdefghijklmnopqrstuv18340");
        boolean b1 = matcher1.matches();
        Matcher matcher2 = pattern.matcher("abcdefghijklmnoasdfasdpqrstuv18340");
        boolean b2 = matcher2.matches();

        System.out.println("abcdefghijklmnopqrstuv18340: " + b1);
        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340: " + b2);
    }
}
