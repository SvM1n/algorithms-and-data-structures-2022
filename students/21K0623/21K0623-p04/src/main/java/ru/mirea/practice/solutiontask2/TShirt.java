package ru.mirea.practice.solutiontask2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Муж. футболка размера " + this.getSize() + " eu: " + this.getSize().getEuroSize() + " цвета "
                + this.getColor() + ". Цена футболки: " + this.getCost());
    }

    public void dressWomen() {
        System.out.println("Жен. футболка размера " + this.getSize() + " eu: " + this.getSize().getEuroSize() + " цвета "
                + this.getColor() + ". Цена футболки: " + this.getCost());
    }
}
