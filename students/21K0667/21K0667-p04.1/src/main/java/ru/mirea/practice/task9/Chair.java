package ru.mirea.practice.task9;

public class Chair extends Furniture {
    private boolean withBack;

    public Chair(double cost, double weight) {
        super(cost, weight);
    }

    public Chair(double cost, double weight, boolean withBack) {
        super(cost, weight);
        this.withBack = withBack;
    }

    public boolean isWithBack() {
        return withBack;
    }

    public void setWithBack(boolean withBack) {
        this.withBack = withBack;
    }

    @Override
    public String toString() {
        return "Цена: " + cost + ", вес: " + weight + ", cо спинкой: " + withBack;
    }
}
