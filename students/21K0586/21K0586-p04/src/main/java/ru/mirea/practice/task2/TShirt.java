package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, String color) {
        super(size, color);
    }

    public TShirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка {" + "размер = " + getSize() + ", цена = " + getCost() + " руб" + ", цвет = " + getColor() + "}";
    }
}
