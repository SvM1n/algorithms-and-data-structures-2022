package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        favoriteSeason(myFavoriteSeason);
        System.out.println(myFavoriteSeason);

        System.out.println("\nAll seasons:");
        for (Season season : Season.values()) {
            System.out.println(season.name());
            System.out.println(season + "\n");
        }
    }

    static void favoriteSeason(Season myFavoriteSeason) {
        switch (myFavoriteSeason) {
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            default:
                break;
        }
    }
}
