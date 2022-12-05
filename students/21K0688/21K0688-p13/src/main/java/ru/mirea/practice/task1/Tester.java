package ru.mirea.practice.task1;

import java.util.Locale;

public abstract class Tester {
    public static void printString(String str) {
        System.out.println(str);
    }

    public static void printLastChar(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static boolean isEndedBy(String str) {
        return str.endsWith("!!!");
    }

    public static boolean isStartBy(String str) {
        return str.startsWith("I Like");
    }

    public static boolean contain(String str) {
        return str.contains("Java");
    }

    public static int findString(String substring, String str) {
        return str.indexOf(substring);
    }

    public static String replace(char ch, String str) {
        str = str.replace('a', ch);
        return str;
    }

    public static String toUpper(String str) {
        str = str.toUpperCase(Locale.ROOT);
        return str;
    }

    public static String toLower(String str) {
        str = str.toLowerCase(Locale.ROOT);
        return str;
    }

    public static String substring(String str, String substring) {
        if (str.contains(substring)) {
            int index = substring.indexOf(str);
            return substring.substring(index + 1);
        }
        return substring + "not contain in " + str;
    }

    public static void main(String[] args) {
        String str = "I Like Java!!!";
        printString(str);
        printLastChar(str);
        System.out.print("is str end by !!!: " + isEndedBy(str) + "\n");
        System.out.print("is str start by I Like: " + isStartBy(str) + "\n");
        System.out.print("is str contain Java: " + contain(str) + "\n");
        System.out.print("position of Java in str: " + findString("Java", str) + "\n");
        System.out.print("after replace: " + replace('o', str) + "\n");
        System.out.print("to upper register: " + toUpper(str) + "\n");
        System.out.print("to lower register: " + toLower(str) + "\n");
        System.out.print(substring(str, "Java"));
    }
}
