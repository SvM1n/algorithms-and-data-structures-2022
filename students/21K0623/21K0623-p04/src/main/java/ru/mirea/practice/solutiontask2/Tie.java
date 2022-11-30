package ru.mirea.practice.solutiontask2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Муж. галстук размера " + this.getSize() + " eu: " + this.getSize().getEuroSize() + " цвета "
                + this.getColor() + ". Цена галстука: " + this.getCost());
    }
}
