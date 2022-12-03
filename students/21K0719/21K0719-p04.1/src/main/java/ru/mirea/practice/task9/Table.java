package ru.mirea.practice.task9;

public class Table extends Furniture {
    public final int size;

    Table(int cost, int weight, int size) {
        super(cost, weight);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Table{"
                +
                getPrice()
                +
                " weight="
                +
                getWeight()
                +
                " size="
                +
                size
                +
                '}';
    }
}
