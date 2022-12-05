package ru.mirea.practice.task4;

public class Computer {
    private String type = "";
    private String model = "";
    private double price = 0.0;

    public Computer(String type, String model, double price) {
        this.type = type;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type is " + type + "\tModel is " + model + "\tPrice is " + price + "\n";
    }


}
