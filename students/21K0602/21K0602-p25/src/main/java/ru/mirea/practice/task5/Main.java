package ru.mirea.practice.task5;

public abstract class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar("29/02/2000");
        System.out.println(calendar.isMatchPattern("29/02/2000"));
    }
}
