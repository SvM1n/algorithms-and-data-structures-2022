package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Юбка\n" + "Размер " + getSize() + "\nЦена " + getCost() + "\nЦвет " + getColor();
    }
}
