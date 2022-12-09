package ru.mirea.practice.task9;

public class Chair extends Furniture {
    private final boolean isSoft;

    public Chair(int cost, int weight, boolean isSoft) {
        super(cost, weight);
        this.isSoft = isSoft;
    }

    public boolean isSoft() {
        return isSoft;
    }

    @Override
    public String toString() {
        return "Chair{"
                + "price="
                + getPrice()
                + "weight="
                + getWeight()
                + "isSoft="
                + isSoft
                + '}';
    }
}