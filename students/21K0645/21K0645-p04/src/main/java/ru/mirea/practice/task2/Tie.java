package ru.mirea.practice.task2;

public class Tie extends Clothes implements ManClothing {

    public Tie(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public void dressMen() {
        System.out.println("Tie on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}
