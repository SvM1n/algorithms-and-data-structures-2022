package ru.mirea.practice.task2;

public class Tshirt extends Clothes implements ManClothing, WomenClothing {

    public Tshirt(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public void dressMen() {
        System.out.println("Tshirt on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Tshirt on woman dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}
