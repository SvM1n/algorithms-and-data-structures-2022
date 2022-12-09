package ru.mirea.practice.program2;

public class TShirt extends Clothes {
    TShirt(Size size, int price, String colour) {
        this.s = size;
        this.price = price;
        this.colour = colour;
    }

    public void dressWomen() {
        System.out.println("T-shirt"
                + "\nSize: " + this.s
                + "\nPrice: " + this.price
                + "\nColour: " + this.colour + '\n');
    }

    public void dressMen() {
        System.out.println("T-shirt"
                + "\nSize: " + this.s
                + "\nPrice: " + this.price
                + "\nColour: " + this.colour + '\n');
    }
}
