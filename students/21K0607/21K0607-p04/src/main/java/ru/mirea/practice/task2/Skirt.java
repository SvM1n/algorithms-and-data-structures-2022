package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Skirt: Size " + getSize() + " Color " + getColor() + " Cost " + getCost();
    }
}
