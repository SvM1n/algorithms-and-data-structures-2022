package ru.mirea.practice.task1;

abstract class Main {


    public void seasons(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("i like spring");
                break;
            case SUMMER:
                System.out.println("i like summer");
                break;
            case WINTER:
                System.out.println("i like winter");
                break;
            case AUTUMN:
                System.out.println("i like autumn");
                break;
            default:
                break;
        }
    }

    public void main(String[] args) {
        Season season = Season.SUMMER;
        seasons(season);

        for (Season iterator : Season.values()) {
            System.out.println(iterator.name() + iterator);
        }

    }


}
