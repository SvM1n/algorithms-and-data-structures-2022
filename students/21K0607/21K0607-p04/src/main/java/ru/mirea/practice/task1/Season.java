package ru.mirea.practice.task1;

public enum Season {
    winter("Cold, Snow, New Year", -20),
    spring("Warming, Flowers, ", 15),
    summer("Hot, Sunny, Chill", 30) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    autumn("Rain, Harvest, Mushrooms", 0);

    private final String charact;
    private final int temp;

    Season(String charact, int temp) {
        this.charact = charact;
        this.temp = temp;
    }

    public String getDescription() {
        return "Cold season";
    }

    @Override
    public String toString() {
        return "characteristic: " + charact + "  temperature: " + temp;
    }
}
