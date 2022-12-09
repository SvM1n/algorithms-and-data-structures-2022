package ru.mirea.practice.task2;

public abstract class Clothes {
    private final Sizes size;
    private final String color;
    private final int cost;

    public Clothes(Sizes size, String color, int cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }
}

