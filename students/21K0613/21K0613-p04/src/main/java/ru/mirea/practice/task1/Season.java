package ru.mirea.practice.task1;

public enum Season {
    SUMMER("(SummerDescription)", +30) {
        @Override
        public String getDescription() {
            return "тёплое время года";
        }
    },
    AUTUMN("(AutumnDescription)", +5),
    WINTER("(WinterDescription)", -20),
    SPRING("(SpringDescription)", +10);

    private int temp = 0;

    Season(String description, int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return "холодное время года";
    }
}
