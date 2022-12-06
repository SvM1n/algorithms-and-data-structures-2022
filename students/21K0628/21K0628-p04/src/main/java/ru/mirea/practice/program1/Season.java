package ru.mirea.practice.program1;

public enum Season {
    WINTER(-30, "snow"),
    SPRING(20, "flowers"),
    SUMMER(35, "sun"),
    AUTUMN(10, "leaves") {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    };
    private int temperature;

    Season(int temperature, String description) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return "Cold season";
    }

    public String toString() {
        return "Average temperature: " + temperature + ", descripton: " + getDescription();
    }
}

