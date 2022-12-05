package ru.mirea.practice.solutiontask2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Муж. штаны размера " + this.getSize() + " eu: " + this.getSize().getEuroSize() + " цвета "
                + this.getColor() + ". Цена штанов: " + this.getCost());
    }

    public void dressWomen() {
        System.out.println("Жен. штаны размера " + this.getSize() + " eu: " + this.getSize().getEuroSize() + " цвета "
                + this.getColor() + ". Цена штанов: " + this.getCost());
    }
}
