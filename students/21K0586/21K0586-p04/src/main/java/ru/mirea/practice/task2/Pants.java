package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны {" + "размер = " + getSize() + ", цена = " + getCost() + " руб" + ", цвет = " + getColor() + "}";
    }
}
