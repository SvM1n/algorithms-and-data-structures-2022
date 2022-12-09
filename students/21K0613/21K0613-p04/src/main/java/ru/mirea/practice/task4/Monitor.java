package ru.mirea.practice.task4;

public class Monitor {
    private double diagonal;
    private int frequency;
    private String screen;

    public Monitor(double diagonal, int frequency, String screen) {
        this.screen = screen;
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{"
                +
                "diagonal=" + diagonal
                +
                ", frequency=" + frequency
                +
                ", screen='" + screen + '\''
                +
                '}';
    }
}
