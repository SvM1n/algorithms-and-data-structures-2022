package ru.mirea.practice.n2to4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = p.matcher("abcdefghijklmnoasdfasdpqrstuv18340");
        boolean b = m.matches();
        System.out.println(b);
    }
}
