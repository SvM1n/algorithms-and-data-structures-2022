package ru.mirea.practice.s21k0709.p401.task9;

public abstract class Furniture {
    String material;
    int id;
    double price;
    double size;

    public Furniture(String material, int id, double price, double size) {
        this.material = material;
        this.id = id;
        this.price = price;
        this.size = size;
    }

    public Furniture() {
        //
    }

    @Override
    public String toString() {
        return "Furniture{"
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
