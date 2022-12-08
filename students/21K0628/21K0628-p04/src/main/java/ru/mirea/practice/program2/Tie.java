package ru.mirea.practice.program2;

public class Tie extends Clothes {
    Tie(Size size, int price, String colour) {
        this.s = size;
        this.price = price;
        this.colour = colour;
    }

    public void dressMen() {
        System.out.println("Tie"
                + "\nSize: " + this.s
                + "\nPrice: " + this.price
                + "\nColour: " + this.colour + '\n');
    }
}
