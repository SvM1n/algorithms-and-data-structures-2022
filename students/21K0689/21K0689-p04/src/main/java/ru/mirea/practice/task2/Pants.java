package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Штаны\n" + "Размер " + getSize() + "\nЦена " + getCost() + "\nЦвет " + getColor();
    }
}
