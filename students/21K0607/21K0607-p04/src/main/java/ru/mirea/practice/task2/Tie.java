package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Tie: Size " + getSize() + " Color " + getColor() + " Cost " + getCost();
    }
}
