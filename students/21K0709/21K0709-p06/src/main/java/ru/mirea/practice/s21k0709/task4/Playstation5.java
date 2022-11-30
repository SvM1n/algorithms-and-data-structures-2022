package ru.mirea.practice.s21k0709.task4;

public class Playstation5 implements Priceable {
    private double price;
    private String name;
    private double ssdCapacity;

    public Playstation5(double price, String name, double ssdCapacity) {
        this.price = price;
        this.name = name;
        this.ssdCapacity = ssdCapacity;
    }

    public Playstation5() {
        //
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSsdCapacity() {
        return ssdCapacity;
    }

    public void setSsdCapacity(double ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
