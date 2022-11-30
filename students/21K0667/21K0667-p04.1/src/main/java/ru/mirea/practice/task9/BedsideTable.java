package ru.mirea.practice.task9;

public class BedsideTable extends Furniture {
    private String type;

    public BedsideTable(double cost, double weight) {
        super(cost, weight);
    }

    public BedsideTable(double cost, double weight, String type) {
        super(cost, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Цена: " + cost + ", вес: " + weight + ", тип: " + type;
    }
}
