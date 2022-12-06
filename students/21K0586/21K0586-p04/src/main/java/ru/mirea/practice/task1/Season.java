package ru.mirea.practice.task1;

public enum Season {
    AUTUMN("rainy", 8),
    WINTER("Snowy", -15),
    SPRING("", 17),
    SUMMER("vacation at the sea", 30) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    };

    private final int temperature;

    Season(String ignoredDescription, int temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return "Cold season";
    }

    @Override
    public String toString() {
        return "DESCRIPTION:\n" + getDescription() + "\nAverage temperature is " + temperature;
    }
}
