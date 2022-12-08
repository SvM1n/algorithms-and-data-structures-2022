package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Галстук: размер - " + getSize() + " цвет - " + getColor() + " стоимость - " + getPrice();
    }
}
