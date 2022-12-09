package ru.mirea.practice.s21k0627.task6to9;

public abstract class Test {
    public static void main(String[] args) {
        Printable[] array = new Printable[2];
        Printable book = new Book("Война и мир", "Лев Толстой", 1867);
        Printable shop = new Shop("Крис Кемпчински", "McDonald’s");
        array[0] = book;
        array[1] = shop;
        for (Printable i : array) {
            i.print();
        }
    }
}
