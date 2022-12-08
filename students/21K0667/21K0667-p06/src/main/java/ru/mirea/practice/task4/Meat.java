package ru.mirea.practice.task4;

public class Meat implements Priceable {
    private String type;
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Meat(String type, double price) {
        this.type = type;
        this.price = price;
    }

}
