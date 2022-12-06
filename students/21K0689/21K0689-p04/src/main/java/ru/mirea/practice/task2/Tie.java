package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Галстук\n" + "Размер " + getSize() + "\nЦена " + getCost() + "\nЦвет " + getColor();
    }
}
