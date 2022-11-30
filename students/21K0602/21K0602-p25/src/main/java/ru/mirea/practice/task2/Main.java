package ru.mirea.practice.task2;

public abstract class Main {

    public static boolean equalsString(String strToCompare) {
        return strToCompare.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        System.out.println(equalsString("abcdgfddfgdfefghijklmnopqrstuv18340"));
    }
}
