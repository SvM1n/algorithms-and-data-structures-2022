package ru.mirea.practice.solutiontask4;

public class Train implements Priceable {
    private final int count;
    private final double cost;

    public Train(int count, double cost) {
        this.count = count;
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost * count;
    }
}
