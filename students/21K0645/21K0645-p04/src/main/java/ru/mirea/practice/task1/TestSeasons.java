package ru.mirea.practice.task1;

public final class TestSeasons {

    private TestSeasons() {
    }

    private static void ilike(Seasons seasons){

        System.out.print("I like ");

        switch (seasons) {
            case Winter -> {
                System.out.println("winter");
            }
            case Spring -> {
                System.out.println("spring");
            }
            case Summer -> {
                System.out.println("summer");
            }
            case Autumn -> {
                System.out.println("autumn");
            }
        }

    }
    public static void main(String[] args) {

        Seasons summer = Seasons.Summer;
        System.out.println(summer.getInfo());

        TestSeasons.ilike(summer);

        for (Seasons season : Seasons.values()) {
            System.out.println(season.getInfo());
        }
    }



}
