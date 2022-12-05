package ru.mirea.practice.task1;

public abstract class Test {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.AUTUMN;
        favoriteSeason(myFavoriteSeason);
        System.out.println(myFavoriteSeason);

        System.out.println("\nAll seasons:\n");
        for (Seasons season : Seasons.values()) {
            System.out.println(season.name());
            System.out.println(season + "\n");
        }
    }

    static void favoriteSeason(Seasons myFavoriteSeason) {
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