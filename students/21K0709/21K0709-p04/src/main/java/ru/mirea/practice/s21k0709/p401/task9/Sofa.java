package ru.mirea.practice.s21k0709.p401.task9;

public class Sofa extends Furniture {
    public Sofa(String material, int id, double price, double size) {
        super(material, id, price, size);
    }

    @Override
    public String toString() {
        return "Sofa{"
                +
                "material='" + material + '\''
                +
                ", ID=" + id
                +
                ", price=" + price
                +
                ", size=" + size
                +
                '}';
    }
}
