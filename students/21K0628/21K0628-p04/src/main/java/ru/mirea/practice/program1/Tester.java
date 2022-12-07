package ru.mirea.practice.program1;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Season favouriteseason = Season.WINTER;
        System.out.println(favouriteseason.name() + favouriteseason);
        switch (favouriteseason) {
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case WINTER:
                System.out.println("I love winter!");
                break;
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            default:
                break;
        }
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season);
        }
    }
}
