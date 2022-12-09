package ru.mirea.practice.task2;

public class Pants extends Clothes implements ManClothing, WomenClothing {

    public Pants(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public void dressMen() {
        System.out.println("Pants on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Pants on woman dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}
