package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Футболка\n" + "Размер " + getSize() + "\nЦена " + getCost() + "\nЦвет " + getColor();
    }
}
