package ru.mirea.practice.task4;

public class Bread implements Priceable {
    private final String name;
    private final int price;

    public Bread(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
