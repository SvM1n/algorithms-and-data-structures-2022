package ru.mirea.practice.task1;

import java.util.Locale;

public abstract class Test {
    private static String str;

    public static void inputString(String string) {
        str = string;
    }

    public static void lastChar() {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static boolean isEndedByExclamationMark() {
        return str.endsWith("!!!");
    }

    public static boolean startWithIlike() {
        return str.startsWith("I like");
    }

    public static boolean containSubString(String string) {
        return str.contains(string);
    }

    public static int findSubString(String substring) {
        return str.indexOf(substring);
    }

    public static void replaceCharacters(char ch) {
        str = str.replace('a', ch);
    }

    public static void toUpperRegister() {
        str = str.toUpperCase(Locale.ROOT);
    }

    public static void toLowerRegister() {
        str = str.toLowerCase(Locale.ROOT);
    }

    public static String substring(String string) {
        if (str.contains(string)) {
            int index = string.indexOf(str);
            return string.substring(index);
        }
        return string + " is not part of " + str;

    }

    public static void main(String[] args) {
        inputString("I like Java!!!");
        lastChar();
        System.out.println("end with !!! " + isEndedByExclamationMark());
        System.out.println("start with I like " + startWithIlike());
        System.out.println("contain substring Java " + containSubString("Java"));
        System.out.println("find index of substring Java " + findSubString("Java"));
        System.out.println(str);
        replaceCharacters('o');
        System.out.println("After replace a to o " + str);
        System.out.println(str);
        toUpperRegister();
        System.out.println(str);
        toLowerRegister();
        System.out.println(str);
        System.out.println(substring("Java"));


    }
}
