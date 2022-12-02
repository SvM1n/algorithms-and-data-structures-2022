package ru.mirea.practice.task1;

public enum Seasons {
    AUTUMN("Rainy, golden leaves", 6),
    WINTER("Snow, cold, New Year", -25.2),
    SPRING("Dirt, sunny", 12),
    SUMMER("Hot", 26.4) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    };
    private final double temperature;

    public String getDescription() {
        return "Cold season";
    }


    Seasons(String description, double temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "DESCRIPTION:\n" + getDescription() + "\nAverage temperature is " + temperature;
    }
}
