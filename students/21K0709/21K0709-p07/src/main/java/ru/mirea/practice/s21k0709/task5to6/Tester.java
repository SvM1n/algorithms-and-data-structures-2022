package ru.mirea.practice.s21k0709.task5to6;

public abstract class Tester {
    public static void main(String[] args) {
        ProcessStrings prStr = new StringImplement("0123456789");
        System.out.println(prStr.countChar());
        System.out.println(prStr.inverse());
        System.out.println(prStr.oddStr());
    }

}
