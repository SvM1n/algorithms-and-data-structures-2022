package ru.mirea.practice.s21k0647.zad4;

public class Service implements Priceable {
    String title;
    int time;
    int price;

    Service(String title, int time, int price) {
        this.title = title;
        this.time = time;
        this.price = price;
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Услуга " + title + "\nВремя " + time + "\nЦена " + getPrice();
    }
}
