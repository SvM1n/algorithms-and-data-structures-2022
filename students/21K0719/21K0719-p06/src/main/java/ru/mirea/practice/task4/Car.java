package ru.mirea.practice.task4;

public class Car implements Priceable {
    int price;

    Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
