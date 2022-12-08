package ru.mirea.practice;

public enum Seasons {
    Winter("Cold season",-15),
    Spring("Wonderful season as my birthday's in April", 15),
    Summer("Warm season", 25),
    Autumn("Windy and rainy season", 7);

    private final int avgTemp;
    private final String inf;

    Seasons(String info, int temperature) {
        this.inf = info;
        this.avgTemp = temperature;
    }

    public String getInfo() {
        return name() + "    Info: " +  inf + "    Temperature: " + avgTemp;
    }

    String getDescription() {
        return "";
    }
}
