package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Футболка: размер - " + getSize() + " цвет - " + getColor() + " стоимость - " + getPrice();
    }

}