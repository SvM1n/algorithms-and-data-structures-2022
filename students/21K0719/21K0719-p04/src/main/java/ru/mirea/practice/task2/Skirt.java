package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Юбка: размер - " + getSize() + " цвет - " + getColor() + " стоимость - " + getPrice();
    }
}
