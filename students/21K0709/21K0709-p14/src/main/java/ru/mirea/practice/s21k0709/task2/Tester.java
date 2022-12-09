package ru.mirea.practice.s21k0709.task2;

public abstract class Tester {
    public static boolean equalsStr(String str) {
        return str.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        System.out.println(equalsStr("abdasewbcdgfddfgdfefghijklmnopqrstuv18340"));
        System.out.println(equalsStr("abcdefghijklmnopqrstuv18340"));
    }
}