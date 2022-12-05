package ru.mirea.practice.solutiontask1;

public final class Tester {
    private Tester() {}

    public static void switchSeason(Season season) {
        switch (season) {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.aboutSeason());

        Season season1 = Season.SUMMER;
        switchSeason(season1);

        System.out.println(season1.getDescription());

        for (Season season2 : Season.values()) {
            System.out.println(season2.aboutSeason());
        }
    }
}
