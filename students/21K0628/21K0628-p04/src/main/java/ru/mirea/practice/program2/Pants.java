package ru.mirea.practice.program2;

public class Pants extends Clothes {
    Pants(Size size, int price, String colour) {
        this.s = size;
        this.price = price;
        this.colour = colour;
    }

    public void dressWomen() {
        System.out.println("Pants"
                + "\nSize: " + this.s
                + "\nPrice: " + this.price
                + "\nColour: " + this.colour + '\n');
    }

    public void dressMen() {
        System.out.println("Pants"
                + "\nSize: " + this.s
                + "\nPrice: " + this.price
                + "\nColour: " + this.colour + '\n');
    }
}
