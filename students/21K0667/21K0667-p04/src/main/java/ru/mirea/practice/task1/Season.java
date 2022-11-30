package ru.mirea.practice.task1;

public enum Season {
    SPRING(8, "Все цветет"),
    SUMMER(19, "Духота") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(5, "Слякоть"),
    WINTER(-12,"Снег");

    private final int avg;
    private final String description;


    Season(int temp, String description) {
        this.avg = temp;
        this.description = description;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return this.name() + " Описание: " + description + ", Средняя температура: " + avg;
    }

    static void favorite(Season best) {
        switch (best) {
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