package ru.mirea.practice.n1;

abstract class Main {
    public static void main(String[] args) {
        Seasons favourite = Seasons.SUMMER;
        System.out.println(love(favourite));
        for (Seasons s : Seasons.values()) {
            System.out.println(s + " avertemp " + s.getAvertemp() + " " + s.getDescription());
        }
    }

    public static String love(Seasons s) {
        switch (s) {
            case WINTER:
                return "I love winter";
            case SPRING:
                return "I love spring";
            case SUMMER:
                return "I love summer";
            case FALL:
                return "I love fall";
            default:
                return "";
        }
    }
}
