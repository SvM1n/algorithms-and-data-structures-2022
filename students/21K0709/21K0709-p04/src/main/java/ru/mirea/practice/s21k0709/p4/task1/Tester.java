package ru.mirea.practice.s21k0709.p4.task1;

public abstract class Tester {
    public static void favSeason(Season season) {
        switch (season) {
            case Winter:
                System.out.println("Я люблю зиму!");
                break;
            case Spring:
                System.out.println("Я люблю весну!");
                break;
            case Summer:
                System.out.println("Я люблю лето!");
                break;
            case Autumn:
                System.out.println("Я люблю осень!");
                break;
            default:
                System.out.println("Я люблю любое время года!");
                break;
        }
    }

    public static void main(String[] args) {
        Season seasonfav = Season.Summer;
        favSeason(seasonfav);
        System.out.println(seasonfav);
        Season[] seasons = Season.values();
        for (Season season: seasons) {
            System.out.println(season.getInfo());
        }
    }


}
