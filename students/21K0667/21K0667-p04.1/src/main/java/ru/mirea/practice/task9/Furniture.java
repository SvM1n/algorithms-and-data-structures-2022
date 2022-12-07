package ru.mirea.practice.task9;

public abstract class Furniture {
    protected double cost;
    protected double weight;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Furniture(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }
}
