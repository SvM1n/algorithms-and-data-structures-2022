package ru.mirea.practice.s21k0709.p4.task2;

public class Skirt extends Clothes {
    Skirt(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("TShirt Size: " + this.size + ", Sum " + this.price + ", Color " + this.color);
    }

}
