package ru.mirea.practice.task1;

abstract class Runner {
    public static void main(String[] args) {
        Season mySeason = Season.winter;
        favorite(mySeason);
        for (Season season : Season.values()) {
            System.out.println(season.name());
            System.out.println(season);
        }
    }

    static void favorite(Season season) {
        switch (season) {
            case autumn:
                System.out.println("I love autumn! ");
                break;

            case spring:
                System.out.println("I love spring! ");
                break;

            case summer:
                System.out.println("I love summer! ");
                break;

            case winter:
                System.out.println("I love winter! ");
                break;
            default:
                break;
        }
    }
}
