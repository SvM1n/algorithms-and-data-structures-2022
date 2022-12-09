package ru.mirea.practice.task1;

import java.text.MessageFormat;

public enum Seasons {

    Winter("This season is cold", -10),
    Spring("This season id warm", 11),
    Summer("This season id hot", 22) {
        @Override
        String getDescription() {
            return "The weather is worm";
        }
    },
    Autumn("This season is rainy", 8);

    private final String information;
    private final int averageTemperature;

    Seasons(String information, int averageTemperature) {
        this.information = information;
        this.averageTemperature = averageTemperature;
    }

    public String getInfo() {
        return MessageFormat.format("{0} : {1} : {2}", name(), information, averageTemperature);
    }

    String getDescription() {
        return "The weather is cold";
    }

}
