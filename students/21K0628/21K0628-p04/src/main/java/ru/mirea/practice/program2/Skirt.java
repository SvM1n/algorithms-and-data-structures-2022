package ru.mirea.practice.program2;

public class Skirt extends Clothes {
    Skirt(Size size, int price, String colour) {
        this.s = size;
        this.price = price;
        this.colour = colour;
    }

    public void dressWomen() {
        System.out.println("Skirt"
                + "\nSize: " + this.s
                + "\nPrice: " + this.price
                + "\nColour: " + this.colour + '\n');
    }
}
