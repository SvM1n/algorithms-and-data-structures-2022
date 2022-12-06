package ru.mirea.practice.task4;

public class Phone implements Priceable {
    private double price;
    private String name;

    @Override
    public double getPrice() {
        return price;
    }

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
