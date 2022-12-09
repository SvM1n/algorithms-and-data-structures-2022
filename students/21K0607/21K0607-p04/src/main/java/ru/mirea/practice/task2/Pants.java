package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Pants: Size " + getSize() + " Color " + getColor() + " Cost " + getCost();
    }
}
