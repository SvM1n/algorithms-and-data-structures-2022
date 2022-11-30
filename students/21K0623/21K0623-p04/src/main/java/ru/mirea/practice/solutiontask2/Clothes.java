package ru.mirea.practice.solutiontask2;

public abstract class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return this.size;
    }

    public double getCost() {
        return this.cost;
    }

    public String getColor() {
        return this.color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void dressWomen() {
        System.out.print("");
    }

    public void dressMan() {
        System.out.print("");
    }
}
