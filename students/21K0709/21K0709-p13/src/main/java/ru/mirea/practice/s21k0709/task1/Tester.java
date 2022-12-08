package ru.mirea.practice.s21k0709.task1;

import java.util.Locale;

public abstract class Tester {
    private static String str;

    public static void inputStr(String string) {
        str = string;
    }

    public static void printStr(String str) {
        System.out.println(str);
    }

    public static void lastCh(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static void endsStr(String str) {
        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается на !!!");
        } else {
            System.out.println("Строка не заканчивается на !!!");
        }
    }

    public static void startsStr(String str) {
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается на I like");
        } else {
            System.out.println("Строка не начинается на I like");
        }
    }

    public static void containsStr(String str) {
        System.out.println(str.contains("Java"));
    }

    public static void indexStr(String str) {
        System.out.println(str.indexOf("Java"));
    }

    public static void replaceStr(String str, String ch1, String ch2) {
        System.out.println(str.replace(ch1,ch2));
    }

    public static void upperStr(String str) {
        System.out.println(str.toUpperCase(Locale.getDefault()));
    }

    public static void lowerStr(String str) {
        System.out.println(str.toLowerCase(Locale.getDefault()));
    }

    public static String subStr(String s) {
        if (str.contains(s)) {
            int index = str.indexOf(s);
            return str.substring(index);
        }
        return s + " не содержит " + str;
    }

    public static void main(String[] args) {
        inputStr("I like Java!!!");
        printStr(str);
        lastCh(str);
        endsStr(str);
        startsStr(str);
        containsStr(str);
        indexStr(str);
        replaceStr(str,"a","o");
        lowerStr(str);
        upperStr(str);
        System.out.println(subStr("Java"));
    }
}
