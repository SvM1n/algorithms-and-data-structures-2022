package ru.mirea.practice.task4.s21k0627;

public class Computer {
    private String os;
    private int price;
    private int yearOfModel;

    public Computer(String os, int price, int yearOfModel) {
        this.os = os;
        this.price = price;
        this.yearOfModel = yearOfModel;
    }

    public String toString() {
        return "OS: " + this.os + ", price: " + this.price + ", year of this model: " + this.yearOfModel;
    }

}
