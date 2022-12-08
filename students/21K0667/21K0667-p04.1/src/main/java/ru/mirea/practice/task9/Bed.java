package ru.mirea.practice.task9;

public class Bed extends Furniture {
    private String size;

    public Bed(double cost, double weight) {
        super(cost, weight);
    }

    public Bed(double cost, double weight, String size) {
        super(cost, weight);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Цена: " + cost + ", вес: " + weight + ", размер: " + size;
    }
}
