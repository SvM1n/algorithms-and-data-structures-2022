package ru.mirea.practice.task2;

public class Skirt extends Clothes implements ManClothing, WomenClothing {

    public Skirt(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public void dressMen() {
        System.out.println("Skirt on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt on woman dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}
