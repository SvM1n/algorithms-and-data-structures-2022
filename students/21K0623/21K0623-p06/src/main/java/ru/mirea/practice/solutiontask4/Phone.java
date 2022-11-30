package ru.mirea.practice.solutiontask4;

public class Phone implements Priceable {
    private final String name;
    private final double cost;

    public Phone(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
