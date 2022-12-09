package ru.mirea.practice.task9;

public class Wardrobe extends Furniture {
    private final int numbersOfShelves;

    public Wardrobe(int cost, int weight, int numbersOfShelves) {
        super(cost, weight);
        this.numbersOfShelves = numbersOfShelves;
    }

    public int getNumbersOfShelves() {
        return numbersOfShelves;
    }

    @Override
    public String toString() {
        return "Wardrobe{"
                + "numbersOfShelves=" + numbersOfShelves
                + '}';
    }
}
