package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Штаны: размер - " + getSize() + " цвет - " + getColor() + " стоимость - " + getPrice();
    }
}
