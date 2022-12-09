package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "TShirt : Size" + getSize() + " Color " + getColor() + " Cost " + getCost();
    }
}
