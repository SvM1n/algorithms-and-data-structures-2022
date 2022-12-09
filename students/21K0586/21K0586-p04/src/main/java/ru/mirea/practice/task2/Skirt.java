package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, String color) {
        super(size, color);
    }

    public Skirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Юбка {" + "размер = " + getSize() + ", цена = " + getCost() + " руб" + ", цвет = " + getColor() + "}";
    }
}
