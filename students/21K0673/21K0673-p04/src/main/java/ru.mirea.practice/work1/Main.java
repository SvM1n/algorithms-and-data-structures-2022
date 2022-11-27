package ru.mirea.practice.work1;

abstract class Main {
    public static void main(String[] args) {
        String season = Seasons.SUMMER.toString();
        System.out.println(season + "\n");
        System.out.println(Seasons.SUMMER.getDescription());
        EnumTest b = new EnumTest(Seasons.SUMMER);
        b.method();
        System.out.println("\n");
        for (Seasons a : Seasons.values()) {
            System.out.println(a.getDescription());
            System.out.println(a.getTemperature());
        }
    }
}
