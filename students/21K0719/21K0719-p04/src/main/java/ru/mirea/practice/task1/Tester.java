package ru.mirea.practice.task1;

abstract class Tester {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.SUMMER;
        favorite(myFavoriteSeason);

        for (Seasons season : Seasons.values()) {
            System.out.println(season.name());
            System.out.println(season + "\n");
        }
    }

    static void favorite(Seasons favoriteSeason) {
        switch (favoriteSeason) {
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            default:
                break;
        }
    }
}
