package ru.mirea.practice.solutiontask2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressWomen() {
        System.out.println("Жен. юбка размера " + this.getSize() + " eu: " + this.getSize().getEuroSize() + " цвета "
                + this.getColor() + ". Цена юбки: " + this.getCost());
    }
}
