package ru.mirea.practice;

abstract class One3 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        for (String arg : args) {
            i += 1;
            System.out.println(arg);
        }
    }
}
