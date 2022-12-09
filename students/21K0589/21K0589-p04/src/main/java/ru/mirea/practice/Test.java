package ru.mirea.practice;

public abstract class Test {
    public static void main(String[] args) {
        Seasons season = Seasons.Spring;

        season.getInfo();

        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons.getInfo());
        }
    }
}