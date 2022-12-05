package ru.mirea.practice.task2;

public class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public Size getSize() {
        return size;
    }
}
