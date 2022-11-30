package ru.mirea.practice.task2;

abstract class Clothes {
    private Sizes size;
    private int price;
    private String color;

    public Clothes(Sizes sizes, int price, String color) {
        this.size = sizes;
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Размер: " + getSize().name() + " Цена: " + getPrice() + " Цвет: " + color;
    }

}
