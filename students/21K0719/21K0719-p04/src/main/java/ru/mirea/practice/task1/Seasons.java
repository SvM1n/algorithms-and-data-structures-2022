package ru.mirea.practice.task1;

public enum Seasons {
    WINTER(-30, "Холодно!"),
    SPRING(20, "Вроде тепло,а вроде и нет"),
    SUMMER(40, "Жарко") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15, "Прохладно,дожди");

    private final int temp;
    private final String description;


    Seasons(int temp, String description) {
        this.temp = temp;
        this.description = description;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "Description: " + description + "\nAvg temp: " + temp;
    }
}
