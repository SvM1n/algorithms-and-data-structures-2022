package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, String color) {
        super(size, color);
    }

    public Tie(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Галстук {" + "размер = " + getSize() + ", цена = " + getCost() + " руб" + ", цвет = " + getColor() + "}";
    }
}
