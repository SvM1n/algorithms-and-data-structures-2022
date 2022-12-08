package ru.mirea.practice.task6to9;

public class Shop implements Printable {
    private Printable[] arr;

    public Shop(Printable[] arr) {
        this.arr = arr;
    }

    @Override
    public void print() {
        for (Printable printable : arr) {
            printable.print();
            System.out.println();
        }
    }
}
