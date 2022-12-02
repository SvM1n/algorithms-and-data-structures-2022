package ru.mirea.practice.solutiontask1;

import java.util.Locale;

public final class StringMutate {
    private StringMutate() {}

    public static void stringMutate(String string) {
        System.out.println(string.charAt(string.length() - 1));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I like"));
        System.out.println(string.contains("Java"));
        System.out.println(string.indexOf("Java"));
        System.out.println(string.replace('a', 'o'));
        System.out.println(string.toUpperCase(Locale.ENGLISH));
        System.out.println(string.toLowerCase(Locale.ENGLISH));
        System.out.println(string.substring(2, 6));
    }

    public static void main(String[] args) {
        stringMutate("I like Java!!!");
    }
}
