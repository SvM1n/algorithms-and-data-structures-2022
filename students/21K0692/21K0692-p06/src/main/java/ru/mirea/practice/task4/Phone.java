package ru.mirea.practice.task4;

public class Phone implements Priceable {
    private int price;

    public Phone(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
