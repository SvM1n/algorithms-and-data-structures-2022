package ru.mirea.practice.n1;

import java.util.Locale;

abstract class Main {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        metod(s);
    }

    public static void metod(String s) {
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase(Locale.ENGLISH));
        System.out.println(s.toLowerCase(Locale.ENGLISH));
        System.out.println(s.substring(1));
    }
}
