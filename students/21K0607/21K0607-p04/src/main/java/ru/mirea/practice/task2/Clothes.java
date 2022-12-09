package ru.mirea.practice.task2;

public abstract class Clothes {
    private Size size;
    private int cost;
    private String color;


    public Clothes(Size size, String color, int cost) {
        this.color = color;
        this.size = size;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
